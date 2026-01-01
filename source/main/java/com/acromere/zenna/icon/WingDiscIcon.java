package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

/**
 * Use <a href="http://www.pic2icon.com/">Pic2Icon</a> to convert to Windows icon.
 */
public class WingDiscIcon extends RenderedIcon {

	double POINT_RADIUS;

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

	private double bx;

	private double by;

	private double dx;

	private double dy;

	private double fx;

	private double fy;

	private double frontStartAngleDeg;

	private double frontSpanAngleDeg;

	private double leftArcStartAngleDeg;

	private double leftArcSpanAngleDeg;

	private double backArcStartAngleDeg;

	private double backArcSpanAngleDeg;

	private double rightArcStartAngleDeg;

	private double rightArcSpanAngleDeg;

	// Gray 400
	private final Color wingColor = Color.web( "#BDBDBD" );

	// Gray 300
	private final Color wingHighlight = Color.web( "#E0E0E0" );

	// Teal 300
	private final Color discColor = Color.web( "#4DB6AC" );

	// Teal 50
	private final Color discHighlight = Color.web( "#E0F2F1" );

	public WingDiscIcon() {
		POINT_RADIUS = g( 2 );
		DISC_RADIUS = g( 5 );
		zx = g( 16 );
		zy = g( 7 );
		yx = g( 7 );
		yy = g( 25 );
		xx = g( 16 );
		xy = g( 22 );
		wx = g( 25 );
		wy = g( 25 );
		vx = xx;
		vy = xy;
	}

	@Override
	protected void render() {
		calculateNumbers();

		// Exhaust
		double r = yy - vy + POINT_RADIUS;
		double rn = POINT_RADIUS - g( 2 );
		startPath();
		if( rn <= 0 ) {
			moveTo( vx, vy );
		} else {
			addArc( xx, xy, rn, rn, 45, 90 );
		}
		addArc( vx, vy, r, r, 225, 90 );
		closePath();
		fill( getPrimaryPaint() );

		// Left wing
		getGraphicsContext2D().save();
		clip( 0, 0, 0.5 * DEFAULT_GRID, DEFAULT_GRID );
		arrow();
		fill();
		getGraphicsContext2D().restore();

		// Right wing
		getGraphicsContext2D().save();
		clip( 0.5 * DEFAULT_GRID, 0, DEFAULT_GRID, DEFAULT_GRID );
		arrow();
		fill();
		getGraphicsContext2D().restore();
	}

	private void arrow() {
		startPath();
		addArc( zx, zy, POINT_RADIUS, POINT_RADIUS, frontStartAngleDeg, frontSpanAngleDeg );
		lineTo( bx, by );
		addArc( yx, yy, POINT_RADIUS, POINT_RADIUS, leftArcStartAngleDeg, leftArcSpanAngleDeg );
		lineTo( dx, dy );
		addArc( xx, xy, POINT_RADIUS, POINT_RADIUS, backArcStartAngleDeg, backArcSpanAngleDeg );
		lineTo( fx, fy );
		addArc( wx, wy, POINT_RADIUS, POINT_RADIUS, rightArcStartAngleDeg, rightArcSpanAngleDeg );
		closePath();
	}

	private void clip( double x, double y, double w, double h ) {
		startPath();
		addRect( x, y, w, h );
		closePath();
		clip();
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

		rightArcStartAngleDeg = 180 + Math.toDegrees( backTangentAngle );
		rightArcSpanAngleDeg = 90 + frontStartAngleDeg + Math.toDegrees( backNormalAngle );

		bx = yx - Math.cos( frontNormalAngle ) * POINT_RADIUS;
		by = yy - Math.sin( frontNormalAngle ) * POINT_RADIUS;

		dx = xx - Math.cos( backTangentAngle ) * POINT_RADIUS;
		dy = xy - Math.sin( backTangentAngle ) * POINT_RADIUS;

		fx = wx - Math.cos( backTangentAngle ) * POINT_RADIUS;
		fy = wy + Math.sin( backTangentAngle ) * POINT_RADIUS;
	}

	public static void main( String[] commands ) {
		proof( new WingDiscIcon() );
	}

}
