package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class DeleteIcon extends RenderedIcon {

	@Override
	protected void render() {
		render2();
	}

	private void render1() {
		// Top
		startPath();
		addArc( g( 16 ), g( 8 ), g( 9 ), g( 3 ), 0, 180 );
		addArc( g( 16 ), g( 10 ), g( 9 ), g( 3 ), 180, 180 );
		// Hole
		moveTo( g( 16 ), g( 8 ) );
		addArc( g( 16 ), g( 8 ), g( 7 ), g( 2 ), 0, 360 );
		fill();

		// Clip
		double y = 10;
		save();
		startPath( g( 0 ), g( y ) );
		addArc( g( 16 ), g( y ), g( 11 ), g( 5 ), 180, 180 );
		lineTo( g( 32 ), g( y ) );
		lineTo( g( 32 ), g( 32 ) );
		lineTo( g( 0 ), g( 32 ) );
		closePath();
		clip();

		// Base
		startPath();
		addArc( g( 16 ), g( 12 ), g( 9 ), g( 3 ), 0, -180 );
		addArc( g( 16 ), g( 24 ), g( 9 ), g( 3 ), 180, 180 );
		closePath();
		fill();
		restore();
	}

	private void render2() {
		// Top
		startPath();
		addArc( g( 16 ), g( 8 ), g( 9 ), g( 3 ), 0, 360 );
		// Hole
		addArc( g( 16 ), g( 8 ), g( 7 ), g( 2 ), 0, 360 );
		fill();

		// Clip
		double y = 8;
		save();
		startPath( g( 0 ), g( y ) );
		addArc( g( 16 ), g( y ), g( 11 ), g( 5 ), 180, 180 );
		lineTo( g( 32 ), g( y ) );
		lineTo( g( 32 ), g( 32 ) );
		lineTo( g( 0 ), g( 32 ) );
		closePath();
		clip();

		// Base
		startPath( g( 7 ), g( y ) );
		addArc( g( 16 ), g( 24 ), g( 9 ), g( 3 ), 180, 180 );
		lineTo( g( 25 ), g( y ) );

		closePath();
		fill();
		restore();
	}

	public static void main( String[] commands ) {
		proof( new DeleteIcon() );
	}

}
