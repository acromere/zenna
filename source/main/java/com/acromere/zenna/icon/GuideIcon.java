package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class GuideIcon extends RenderedIcon {

	@Override
	protected void render() {
		setDrawWidth( g( 2 ) );
		startPath();
		moveTo( g( 11 ), g( 9 ) );
		lineTo( g( 11 ), g( 27 ) );
		lineTo( g( 17 ), g( 27 ) );
		moveTo( g( 11 ), g( 15 ) );
		lineTo( g( 17 ), g( 15 ) );
		closePath();
		draw();

		startPath();
		moveTo( g( 11 ), g( 5 ) );
		addArc( g( 11 ), g( 5 ), g( 4 ), g( 4 ), 0, 360 );
		moveTo( g( 21 ), g( 15 ) );
		addArc( g( 21 ), g( 15 ), g( 4 ), g( 4 ), 0, 360 );
		moveTo( g( 21 ), g( 27 ) );
		addArc( g( 21 ), g( 27 ), g( 4 ), g( 4 ), 0, 360 );
		closePath();
		fill();

		//		fillCenteredOval( g( 11 ), g( 5 ), g( 4 ), g( 4 ) );
		//		fillCenteredOval( g( 21 ), g( 15 ), g( 4 ), g( 4 ) );
		//		fillCenteredOval( g( 21 ), g( 27 ), g( 4 ), g( 4 ) );
		//
		//		drawCenteredOval( g( 11 ), g( 5 ), g( 4 ), g( 4 ) );
		//		drawCenteredOval( g( 21 ), g( 15 ), g( 4 ), g( 4 ) );
		//		drawCenteredOval( g( 21 ), g( 27 ), g( 4 ), g( 4 ) );
	}

	public static void main( String[] commands ) {
		proof( new GuideIcon() );
	}

}
