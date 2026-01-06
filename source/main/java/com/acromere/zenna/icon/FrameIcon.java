package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class FrameIcon extends RenderedIcon {

	public static void main( String[] commands ) {
		proof( new FrameIcon() );
	}

	@Override
	protected void render() {
		startPath();
		addArc( g( 4 ), g( 6 ), g( 2 ), g( 2 ), 90, 90 );
		addArc( g( 4 ), g( 26 ), g( 2 ), g( 2 ), 180, 90 );
		addArc( g( 28 ), g( 26 ), g( 2 ), g( 2 ), 270, 90 );
		addArc( g( 28 ), g( 6 ), g( 2 ), g( 2 ), 0, 90 );

		addRect( g( 4 ), g( 6 ), g( 24 ), g( 4 ) );
		addRect( g( 4 ), g( 12 ), g( 24 ), g( 14 ) );
		closePath();
		fill();
	}

}
