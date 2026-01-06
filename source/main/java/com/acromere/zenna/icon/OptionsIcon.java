package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class OptionsIcon extends RenderedIcon {

	private static final int GAP = 13;

	private static final int STROKE = 2;

	private static final int Y1 = 8;

	private static final int Y2 = 16;

	private static final int Y3 = 24;

	public static void main( String[] commands ) {
		proof( new OptionsIcon() );
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
		renderBar( 4, GAP - 3, y );
		renderBar( GAP + 3, 28, y );
	}

	private void renderBar( int x1, int x2, int y ) {
		renderValue( x1 - STROKE, y - STROKE, (x2 - x1) + 2 * STROKE, 2 * STROKE );
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
