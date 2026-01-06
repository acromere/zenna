package com.acromere.zenna.icon;

import com.acromere.zerra.image.Proof;
import com.acromere.zerra.image.SvgIcon;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class WingArcIcon extends SvgIcon {

	protected double bx;

	protected double by;

	protected double cx;

	protected double cy;

	protected double dx;

	protected double dy;

	protected double fx;

	protected double fy;

	protected double tx;

	protected double ty;

	protected double frontStartAngleDeg;

	protected double frontSpanAngleDeg;

	protected double leftArcStartAngleDeg;

	protected double leftArcSpanAngleDeg;

	protected double backArcStartAngleDeg;

	protected double backArcSpanAngleDeg;

	protected double rightArcStartAngleDeg;

	protected double rightArcSpanAngleDeg;

	protected double POINT_RADIUS;

	protected double BACK_RADIUS;

	protected double DISC_RADIUS;

	protected double zx;

	protected double zy;

	protected double yx;

	protected double yy;

	protected double xx;

	protected double xy;

	protected double wx;

	protected double wy;

	protected double vx;

	protected double vy;

	public WingArcIcon() {
		POINT_RADIUS = 2;
		DISC_RADIUS = 5;
		zx = 16;
		zy = 7;
		yx = 7;
		yy = 25;
		xx = 16;
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

		wing.append( arc( true, zx, zy, POINT_RADIUS, -frontStartAngleDeg, -frontSpanAngleDeg ) );
		wing.append( "L" ).append( bx ).append( "," ).append( by ).append( " " );
		wing.append( arc( yx, yy, POINT_RADIUS, -leftArcStartAngleDeg, -leftArcSpanAngleDeg ) );
		wing.append( arc( tx, ty, BACK_RADIUS, -backArcStartAngleDeg, -backArcSpanAngleDeg ) );
		wing.append( arc( wx, wy, POINT_RADIUS, -rightArcStartAngleDeg, -rightArcSpanAngleDeg ) );
		wing.append( "Z" );

		return wing.toString();
	}

	protected void calculateNumbers() {
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

		rightArcStartAngleDeg = 180 + Math.toDegrees( backTangentAngle );
		rightArcSpanAngleDeg = 90 + frontStartAngleDeg + Math.toDegrees( backNormalAngle );

		bx = yx - Math.cos( frontNormalAngle ) * POINT_RADIUS;
		by = yy - Math.sin( frontNormalAngle ) * POINT_RADIUS;

		cx = yx + Math.cos( backNormalAngle ) * POINT_RADIUS;
		cy = yy + Math.sin( backNormalAngle ) * POINT_RADIUS;

		dx = xx - Math.cos( backTangentAngle ) * POINT_RADIUS;
		dy = xy - Math.sin( backTangentAngle ) * POINT_RADIUS;

		fx = wx - Math.cos( backTangentAngle ) * POINT_RADIUS;
		fy = wy + Math.sin( backTangentAngle ) * POINT_RADIUS;

		// Calculate the radius of the back arc
		adj = xx - cx;
		opp = adj * Math.tan( backTangentAngle );
		BACK_RADIUS = Math.sqrt( Math.pow( opp, 2 ) + Math.pow( adj, 2 ) );

		// Calculate the center of the back arc
		tx = xx;
		ty = cy + opp;
	}

	public static void main( String[] commands ) {
		Proof.proof( new WingArcIcon(), Color.web( "#206080" ), null );
	}

}
