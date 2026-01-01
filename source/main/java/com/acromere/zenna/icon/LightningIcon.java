package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class LightningIcon extends RenderedIcon {

	@Override
	protected void render() {
		// Bolt
		startPath();
		moveTo( g( 16 ), g( 5 ) );
		lineTo( g( 11 ), g( 17 ) );
		lineTo( g( 15 ), g( 17 ) );
		lineTo( g( 9 ), g( 29 ) );
		lineTo( g( 21 ), g( 13 ) );
		lineTo( g( 17 ), g( 13 ) );
		lineTo( g( 21 ), g( 5 ) );
		closePath();
		fill();
	}

	public static void main( String[] commands ) {
		proof( new LightningIcon() );
	}

}
