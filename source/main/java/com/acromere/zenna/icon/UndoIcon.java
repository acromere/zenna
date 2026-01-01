package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class UndoIcon extends RenderedIcon {

	@Override
	protected void render() {
		startPath();
		moveTo( g( 16 ), g( 7 ) );
		lineTo( g( 4 ), g( 13 ) );
		lineTo( g( 16 ), g( 19 ) );
		closePath();
		fill();

		startPath();
		addArc( g( 16 ), g( 19 ), g( 14 ), g( 8 ), 90, -180 );
		addArc( g( 16 ), g( 21 ), g( 10 ), g( 6 ), 270, 180 );
		closePath();

		fill();
	}

	public static void main( String[] commands ) {
		proof( new UndoIcon() );
	}

}
