package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class FloppyDiskIcon extends RenderedIcon {

	public static void main( String[] commands ) {
		proof( new FloppyDiskIcon() );
	}

	@Override
	protected void render() {
		// Disk
		startPath();
		addArc( g( 4 ), g( 4 ), g( 2 ), g( 2 ), 90, 90 );
		addArc( g( 4 ), g( 28 ), g( 2 ), g( 2 ), 180, 90 );
		lineTo( g( 10 ), g( 30 ) );
		addArc( g( 14 ), g( 28 ), g( 4 ), g( 4 ), 180, -90 );
		addArc( g( 18 ), g( 28 ), g( 4 ), g( 4 ), 90, -90 );
		lineTo( g( 22 ), g( 30 ) );
		addArc( g( 28 ), g( 28 ), g( 2 ), g( 2 ), 270, 90 );
		addArc( g( 28 ), g( 4 ), g( 2 ), g( 2 ), 0, 90 );

		// Label
		addRect( g( 6 ), g( 6 ), g( 20 ), g( 12 ) );
		closePath();
		fill();

		// Slide
		startPath( g( 12 ), g( 30 ) );
		addArc( g( 14 ), g( 28 ), g( 2 ), g( 2 ), 180, -90 );
		addArc( g( 18 ), g( 28 ), g( 2 ), g( 2 ), 90, -90 );
		lineTo( g( 20 ), g( 30 ) );
		closePath();
		fill();
	}

}
