package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;
import javafx.geometry.Point2D;

public class RefreshIcon extends RenderedIcon {

	private static final double CX = 16;

	private static final double CY = 16;

	@Override
	protected void render() {
		// The outside radius of the arrow circle
		double radius = g( 14 );

		// The angle, in degrees, between the end of the arrow, the center of the icon and the tip of the next arrow
		double gap = 5;

		// The angle, in degrees, from the baseline to the tip of the arrow
		double tilt = 0;

		double extent = 180 - (2 * gap);

		// The angle back from the tip of the arrow head
		// NOTE If alpha and beta are the same, the angle at the back tip is 90
		double alpha = 80;

		// The angle from the baseline to the back tip of the arrow
		// NOTE If alpha and beta are the same, the angle at the back tip is 90
		double beta = 60;

		// The additional angle of the back edge of the arrow head
		double sweep = 20;

		double tailAngle = tilt + gap;
		double tipAngle = tailAngle + extent;

		double theta = 180 - (beta + (90 - alpha));
		double arrowAngle = tipAngle - beta;
		double arrowRadius = radius * (Math.sin( Math.toRadians( 90 - alpha ) ) / Math.sin( Math.toRadians( theta ) ));
		double arrowX = CX + Math.cos( Math.toRadians( arrowAngle ) ) * arrowRadius;
		double arrowY = CY - Math.sin( Math.toRadians( arrowAngle ) ) * arrowRadius;

		double shaftRadius = radius + 0.3 * (arrowRadius - radius);
		double shaftX = CX + Math.cos( Math.toRadians( arrowAngle + sweep ) ) * shaftRadius;
		double shaftY = CY - Math.sin( Math.toRadians( arrowAngle + sweep ) ) * shaftRadius;

		double tailX = CX + Math.cos( Math.toRadians( tailAngle ) ) * radius;
		double tailY = CY - Math.sin( Math.toRadians( tailAngle ) ) * radius;

		double midpointX = 0.5 * (tailX + shaftX);
		double midpointY = 0.5 * (tailY + shaftY);

		Point2D tailVector = new Point2D( tailX - shaftX, tailY - shaftY );
		double tailMagnitude = Math.sqrt( tailVector.getX() * tailVector.getX() + tailVector.getY() * tailVector.getY() );
		Point2D centerVector = new Point2D( -tailVector.getY() / tailMagnitude, tailVector.getX() / tailMagnitude );

		double tailRadius = tailMagnitude / Math.sqrt( 3 );
		Point2D tailCenter = new Point2D( midpointX + centerVector.getX() * 0.5 * tailRadius, midpointY + centerVector.getY() * 0.5 * tailRadius );
		double tailStart = Math.toDegrees( Math.atan2( tailCenter.getY() - shaftY, shaftX - tailCenter.getX() ) );

		startPath();
		addArc( CX, CY, radius, radius, tailAngle, extent );
		lineTo( arrowX, arrowY );
		lineTo( shaftX, shaftY );
		addArc( tailCenter.getX(), tailCenter.getY(), tailRadius, tailRadius, tailStart, -120 );
		closePath();
		fill();

		startPath();
		addArc( CX, CY, radius, radius, tailAngle + 180, extent );
		lineTo( rotate( arrowX ), rotate( arrowY ) );
		lineTo( rotate( shaftX ), rotate( shaftY ) );
		addArc( rotate( tailCenter.getX() ), rotate( tailCenter.getY() ), tailRadius, tailRadius, tailStart + 180, -120 );
		closePath();
		fill();
	}

	private double rotate( double value ) {
		return -(value - 16) + 16;
	}

	public static void main( String[] commands ) {
		proof( new RefreshIcon() );
	}

}
