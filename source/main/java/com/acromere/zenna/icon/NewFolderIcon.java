package com.acromere.zenna.icon;

public class NewFolderIcon extends FolderIcon {

	@Override
	protected void render() {
		save();

		// Create clip area for existing folder icon
		startPath( g( 0 ), g( 0 ) );
		lineTo( g( 22 ), g( 0 ) );
		lineTo( g( 22 ), g( 6 ) );
		addArc( g( 24 ), g( 6 ), g( 2 ), g( 2 ), 180, 90 );
		lineTo( g( 28 ), g( 8 ) );
		addArc( g( 26 ), g( 6 ), g( 2 ), g( 2 ), -90, 90 );
		lineTo( g( 28 ), g( 0 ) );
		lineTo( g( 32 ), g( 0 ) );
		lineTo( g( 32 ), g( 32 ) );
		lineTo( g( 0 ), g( 32 ) );
		closePath();
		clip();

		super.render();

		restore();

		startPath( g( 24 ), g( 0 ) );
		lineTo( g( 26 ), g( 0 ) );
		lineTo( g( 26 ), g( 2 ) );
		lineTo( g( 28 ), g( 2 ) );
		lineTo( g( 28 ), g( 4 ) );
		lineTo( g( 26 ), g( 4 ) );
		lineTo( g( 26 ), g( 6 ) );
		lineTo( g( 24 ), g( 6 ) );
		lineTo( g( 24 ), g( 4 ) );
		lineTo( g( 22 ), g( 4 ) );
		lineTo( g( 22 ), g( 2 ) );
		lineTo( g( 24 ), g( 2 ) );
		closePath();
		fill();
	}

	public static void main( String[] commands ) {
		proof( new NewFolderIcon() );
	}

}
