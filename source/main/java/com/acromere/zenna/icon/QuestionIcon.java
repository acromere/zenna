package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class QuestionIcon extends RenderedIcon {

	public static void main( String[] commands ) {
		proof( new QuestionIcon() );
	}

	@Override
	protected void render() {
		// Squiggle
		startPath();
		moveTo( g( 9 ), g( 10 ) );
		addArc( g( 12 ), g( 10 ), g( 3 ), g( 2 ), 180, 180 );
		addArc( g( 16 ), g( 10 ), g( 1 ), g( 1 ), 180, -180 );
		curveTo( g( 17 ), g( 14 ), g( 13 ), g( 12 ), g( 13 ), g( 18 ) );
		addArc( g( 16 ), g( 18 ), g( 3 ), g( 2 ), 180, 180 );

		curveTo( g( 19 ), g( 14 ), g( 23 ), g( 14 ), g( 23 ), g( 10 ) );
		addArc( g( 16 ), g( 10 ), g( 7 ), g( 6 ), 0, 180 );
		closePath();
		fill();

		// Dot
		startPath();
		addArc( g( 16 ), g( 26 ), g( 3 ), g( 3 ), 0, 360 );
		closePath();
		fill();
	}

}
