package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class MarketIcon extends RenderedIcon {

	public static void main( String[] commands ) {
		proof( new MarketIcon() );
	}

	@Override
	protected void render() {
		// Bag
		startPath( g( 6 ), g( 10 ) );
		addArc( g( 8 ), g( 26 ), g( 2 ), g( 2 ), 180, 90 );
		addArc( g( 24 ), g( 26 ), g( 2 ), g( 2 ), 270, 90 );
		lineTo( g( 26 ), g( 10 ) );
		closePath();
		fill();

		// Handle
		setStrokeWidth( g( 2 ) );
		startPath( g( 11 ), g( 10 ) );
		lineTo( g( 11 ), g( 9 ) );
		addArc( g( 16 ), g( 9 ), g( 5 ), g( 4 ), 180, -180 );
		lineTo( g( 21 ), g( 10 ) );
		draw();
	}

}
