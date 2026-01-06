package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class PropertiesIcon extends RenderedIcon {

	private static final int KEY_X = 4;

	private static final int KEY_RADIUS = 2;

	private static final int PROPERTY_LEFT = KEY_X + 4;

	private static final int PROPERTY_RIGHT = 30 - PROPERTY_LEFT;

	private static final int Y1 = 8;

	private static final int Y2 = 16;

	private static final int Y3 = 24;

	public static void main( String[] commands ) {
		proof( new PropertiesIcon() );
	}

	@Override
	protected void render() {
		renderRows();
	}

	private void renderRows() {
		renderSlider( Y1 );
		renderSlider( Y2 );
		renderSlider( Y3 );
	}

	private void renderSlider( int y ) {
		renderKey( KEY_X, y, KEY_RADIUS );
		renderValue( PROPERTY_LEFT, y - KEY_RADIUS, PROPERTY_RIGHT, 2 * KEY_RADIUS );
	}

	private void renderKey( int x, int y, int r ) {
		startPath();
		addOval( x, y, r, r );
		closePath();
		fill();
	}

	private void renderValue( int x, int y, int w, int h ) {
		startPath();
		int r = h / 2;
		moveTo( g( x + r ), g( y ) );
		addArc( g( x + r ), g( y + r ), g( r ), g( r ), 90, 180 );
		lineTo( g( x + w - r ), g( y + h ) );
		addArc( g( x + w - r ), g( y + r ), g( r ), g( r ), 270, 180 );
		closePath();
		fill();
	}

}
