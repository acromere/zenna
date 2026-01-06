package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;
import javafx.geometry.Point2D;

public class WingArcIcon extends SvgIcon {

	protected double bx;

	protected double by;

	protected double dx;

	protected double dy;

	protected double fx;

	protected double fy;

	protected double frontStartAngleDeg;

	protected double frontSpanAngleDeg;

	protected double leftArcStartAngleDeg;

	protected double leftArcSpanAngleDeg;

	protected double backArcStartAngleDeg;

	protected double backArcSpanAngleDeg;

	protected double rightArcStartAngleDeg;

	protected double rightArcSpanAngleDeg;

	double POINT_RADIUS;

	double BACK_RADIUS;

	double DISC_RADIUS;

	double zx;

	double zy;

	double yx;

	double yy;

	double xx;

	double xy;

	double wx;

	double wy;

	double vx;

	double vy;

	public WingArcIcon() {
		POINT_RADIUS = 2;
		BACK_RADIUS = 8;
		DISC_RADIUS = 5;
		zx = 16;
		zy = 7;
		yx = 7;
		yy = 25;
		xx = 16;
		// TODO This may need to be calculated
		xy = 22;
		wx = 25;
		wy = 25;
		vx = xx;
		vy = xy;

		calculateNumbers();
	}

	@Override
	protected void define() {
		super.define();

		fill( wing() );

	}

	protected String wing() {
		StringBuilder wing = new StringBuilder();

		System.out.println( "start=" + frontStartAngleDeg + " extent=" + frontSpanAngleDeg );

		wing.append( arc( true, zx, zy, POINT_RADIUS, -frontStartAngleDeg, -frontSpanAngleDeg ) );
		wing.append( "L" + bx + "," + by + " " );
		wing.append( arc( yx, yy, POINT_RADIUS, -leftArcStartAngleDeg, -leftArcSpanAngleDeg ) );
		//wing.append( "L" + dx + "," + dy + " " );
		wing.append( arc( xx, xy + 9, BACK_RADIUS, -backArcStartAngleDeg, -backArcSpanAngleDeg ) );
		//wing.append( "L" + fx + "," + fy + " " );
		wing.append( arc( wx, wy, POINT_RADIUS, -rightArcStartAngleDeg, -rightArcSpanAngleDeg ) );

		wing.append( "Z" );

		return wing.toString();
	}

	private void arrow() {
		//		startPath();
		//		addArc( zx, zy, POINT_RADIUS, POINT_RADIUS, frontStartAngleDeg, frontSpanAngleDeg );
		//		lineTo( bx, by );
		//		addArc( yx, yy, POINT_RADIUS, POINT_RADIUS, leftArcStartAngleDeg, leftArcSpanAngleDeg );
		//		lineTo( dx, dy );
		//		addArc( xx, xy, POINT_RADIUS, POINT_RADIUS, backArcStartAngleDeg, backArcSpanAngleDeg );
		//		lineTo( fx, fy );
		//		addArc( wx, wy, POINT_RADIUS, POINT_RADIUS, rightArcStartAngleDeg, rightArcSpanAngleDeg );
		//		closePath();
	}

	private void calculateNumbers() {
		double frontTangent = (yy - zy) / (zx - yx);
		double frontNormal = 1 / frontTangent;
		double frontNormalAngle = Math.atan( frontNormal );
		frontStartAngleDeg = Math.toDegrees( frontNormalAngle );
		frontSpanAngleDeg = 180 - (2 * frontStartAngleDeg);

		Point2D x = new Point2D( xx, xy );
		Point2D y = new Point2D( yx, yy );
		double hyp = x.distance( y );
		double opp = 2 * POINT_RADIUS;
		double adj = Math.sqrt( Math.pow( hyp, 2 ) - Math.pow( opp, 2 ) );

		double alpha = Math.atan2( xy - yy, xx - yx );
		double beta = Math.atan2( adj, opp );

		double backTangentAngle = alpha + beta;
		double backNormalAngle = Math.PI / 2 - backTangentAngle;

		leftArcStartAngleDeg = 180 - frontStartAngleDeg;
		leftArcSpanAngleDeg = 90 + frontStartAngleDeg + Math.toDegrees( backNormalAngle );

		backArcStartAngleDeg = Math.toDegrees( Math.PI - backTangentAngle );
		backArcSpanAngleDeg = Math.toDegrees( -backNormalAngle * 2 );

		// NEXT Create a new back arc radius to span the whole wing

		rightArcStartAngleDeg = 180 + Math.toDegrees( backTangentAngle );
		rightArcSpanAngleDeg = 90 + frontStartAngleDeg + Math.toDegrees( backNormalAngle );

		bx = yx - Math.cos( frontNormalAngle ) * POINT_RADIUS;
		by = yy - Math.sin( frontNormalAngle ) * POINT_RADIUS;

		dx = xx - Math.cos( backTangentAngle ) * POINT_RADIUS;
		dy = xy - Math.sin( backTangentAngle ) * POINT_RADIUS;

		fx = wx - Math.cos( backTangentAngle ) * POINT_RADIUS;
		fy = wy + Math.sin( backTangentAngle ) * POINT_RADIUS;
	}

}
