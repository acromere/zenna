package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;
import javafx.geometry.Point2D;

public class PowerIcon extends RenderedIcon {

	private final Point2D center = new Point2D( g( 16 ), g( 18 ) );

	private final double radius = g( 12 );

	public static void main( String[] commands ) {
		proof( new PowerIcon() );
	}

	@Override
	protected void render() {
		renderWithStroke();
	}

	private void renderWithStroke() {
		startPath();
		moveTo( center.getX(), g( 4 ) );
		lineTo( center.getX(), g( 14 ) );
		draw();

		startPath();
		double angle = 35;
		addArc( center.getX(), center.getY(), radius, radius, 90 + angle, 360 - (2 * angle) );
		draw();
	}

}
