package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class HomeIcon extends RenderedIcon {

	private static final double sqrt8 = Math.sqrt( 8 );

	@Override
	protected void render() {
		// Roof
		startPath( g( 4 ), g( 16 ) );
		lineTo( g( 16 ), g( 4 ) );
		lineTo( g( 28 ), g( 16 ) );
		draw();

		// House
		double y = 7 + sqrt8;
		startPath();
		moveTo( g( 16 ), g( y ) );
		lineTo( g( 6 ), g( y + 10 ) );
		lineTo( g( 6 ), g( 30 ) );
		lineTo( g( 26 ), g( 30 ) );
		lineTo( g( 26 ), g( y + 10 ) );
		// Door
		addRect( g( 12 ), g( 22 ), g( 8 ), g( 8 ) );

		closePath();
		fill();

		//		// Door outline
		//		startPath();
		//		moveTo( g( 13 ), g( 29 ) );
		//		lineTo( g( 13 ), g( 21 ) );
		//		lineTo( g( 19 ), g( 21 ) );
		//		lineTo( g( 19 ), g( 29 ) );
		//		draw();

		//		// House outline
		//		startPath();
		//		moveTo( g( 7 ), g( 17 ) );
		//		lineTo( g( 7 ), g( 29 ) );
		//		lineTo( g( 25 ), g( 29 ) );
		//		lineTo( g( 25 ), g( 17 ) );
		//		draw();
		//
		//		// Roof
		//		startPath();
		//		moveTo( g( 16 ), g( 4 ) );
		//		lineTo( g( 3 ), g( 17 ) );
		//		lineTo( g( 5 ), g( 19 ) );
		//		lineTo( g( 16 ), g( 8 ) );
		//		lineTo( g( 27 ), g( 19 ) );
		//		lineTo( g( 29 ), g( 17 ) );
		//		closePath();
		//		fillAndDraw( GradientTone.LIGHT );
	}

	public static void main( String[] args ) {
		proof( new HomeIcon() );
	}

}
