package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class WorkareaRenameIcon extends RenderedIcon {

	@Override
	protected void render() {
		startPath();
		addArc( g( 6 ), g( 6 ), g( 2 ), g( 2 ), 90, 90 );
		lineTo( g( 4 ), g( 8 ) );
		lineTo( g( 28 ), g( 8 ) );
		addArc( g( 26 ), g( 6 ), g( 2 ), g( 2 ), 0, 90 );
		closePath();
		fill();

		// Split
		startPath();
		addArc( g( 26 ), g( 26 ), g( 2 ), g( 2 ), 270, 90 );
		lineTo( g( 28 ), g( 24 ) );
		lineTo( g( 4 ), g( 24 ) );
		addArc( g( 6 ), g( 26 ), g( 2 ), g( 2 ), 180, 90 );
		closePath();
		fill();

		startPath();
		addArc( g( 2 ), g( 12 ), g( 2 ), g( 2 ), 90, 90 );
		addArc( g( 2 ), g( 20 ), g( 2 ), g( 2 ), 180, 90 );
		addArc( g( 30 ), g( 20 ), g( 2 ), g( 2 ), 270, 90 );
		addArc( g( 30 ), g( 12 ), g( 2 ), g( 2 ), 0, 90 );
		addRect( g( 6 ), g( 12 ), g( 2 ), g( 8 ) );
		closePath();
		fill();
	}

	public static void main( String[] commands ) {
		proof( new WorkareaRenameIcon() );
	}

}
