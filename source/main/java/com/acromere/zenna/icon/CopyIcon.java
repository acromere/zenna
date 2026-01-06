package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class CopyIcon extends RenderedIcon {

	public static void main( String[] commands ) {
		proof( new CopyIcon() );
	}

	@Override
	protected void render() {
		backPage();
		frontPage();
		//		renderPage();
		//		//setColorMode( ColorMode.SECONDARYA );
		//		fill();
		//
		//		move( g( 8 ), g( 4 ) );
		//
		//		renderPage();
		//		//setColorMode( ColorMode.PRIMARY );
		//		fill(  );
		//
		//		reset();
	}

	private void backPage() {
		// 4,4 w14 h18
		startPath();
		addArc( g( 16 ), g( 6 ), g( 2 ), g( 2 ), 0, 90 );
		addArc( g( 6 ), g( 6 ), g( 2 ), g( 2 ), 90, 90 );
		addArc( g( 6 ), g( 20 ), g( 2 ), g( 2 ), 180, 90 );
		lineTo( g( 10 ), g( 22 ) );
		addArc( g( 14 ), g( 12 ), g( 4 ), g( 4 ), 180, -90 );
		lineTo( g( 18 ), g( 8 ) );
		closePath();
		fill();
	}

	private void frontPage() {
		// 12,8 w14 h18
		startPath();
		addArc( g( 14 ), g( 12 ), g( 2 ), g( 2 ), 90, 90 );
		addArc( g( 14 ), g( 26 ), g( 2 ), g( 2 ), 180, 90 );
		addArc( g( 24 ), g( 26 ), g( 2 ), g( 2 ), 270, 90 );
		addArc( g( 24 ), g( 12 ), g( 2 ), g( 2 ), 0, 90 );
		closePath();
		fill();
	}

	private void renderPage() {
		startPath();
		moveTo( g( 5 ), g( 5 ) );
		lineTo( g( 5 ), g( 23 ) );
		lineTo( g( 19 ), g( 23 ) );
		lineTo( g( 19 ), g( 5 ) );
		closePath();
	}

}
