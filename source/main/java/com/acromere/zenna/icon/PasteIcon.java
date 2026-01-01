package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class PasteIcon extends RenderedIcon {

	@Override
	protected void render() {
		// Board
		startPath();
		addArc( g( 8 ), g( 8 ), g( 2 ), g( 2 ), 90, 90 );
		addArc( g( 8 ), g( 28 ), g( 2 ), g( 2 ), 180, 90 );
		addArc( g( 24 ), g( 28 ), g( 2 ), g( 2 ), 270, 90 );
		addArc( g( 24 ), g( 8 ), g( 2 ), g( 2 ), 0, 90 );

		addArc( g( 21 ), g( 5 ), g( 1 ), g( 1 ), 270, -90 );
		addArc( g( 17 ), g( 5 ), g( 3 ), g( 3 ), 0, 90 );
		addArc( g( 15 ), g( 5 ), g( 3 ), g( 3 ), 90, 90 );
		addArc( g( 11 ), g( 5 ), g( 1 ), g( 1 ), 0, -90 );

		// Clip
		moveTo( g( 16 ), g( 4 ) );
		addArc( g( 16 - 1 ), g( 5 ), g( 1 ), g( 1 ), 90, 180 );
		addArc( g( 16 + 1 ), g( 5 ), g( 1 ), g( 1 ), 270, 180 );

		// Page
		addRect( g( 8 ), g( 8 ), g( 16 ), g( 20 ) );
		addRect( g( 10 ), g( 10 ), g( 12 ), g( 16 ) );
		closePath();
		fill();
	}

	public static void main( String[] commands ) {
		proof( new PasteIcon() );
	}

}
