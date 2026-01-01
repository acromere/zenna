package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class ExclamationIcon extends RenderedIcon {

	@Override
	protected void render() {
		// Bar
		startPath();
		moveTo( g( 16 ), g( 4 ) );
		curveTo( g( 13 ), g( 4 ), g( 13 ), g( 7 ), g( 13 ), g( 10 ) );
		curveTo( g( 13 ), g( 14 ), g( 13 ), g( 20 ), g( 16 ), g( 20 ) );
		curveTo( g( 19 ), g( 20 ), g( 19 ), g( 14 ), g( 19 ), g( 10 ) );
		curveTo( g( 19 ), g( 7 ), g( 19 ), g( 4 ), g( 16 ), g( 4 ) );
		closePath();
		fill();

		// Dot
		startPath();
		addArc( g( 16 ), g( 26 ), g( 3 ), g( 3 ), 0, 360 );
		closePath();
		fill();
	}

	public static void main( String[] commands ) {
		proof( new ExclamationIcon() );
	}

}
