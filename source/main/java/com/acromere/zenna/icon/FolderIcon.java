package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;
import javafx.scene.paint.Color;

public class FolderIcon extends RenderedIcon {

	public static void main( String[] commands ) {
		proof( new FolderIcon() );
	}

	@Override
	protected void render() {
		startPath( g( 0 ), g( 14 ) );
		lineTo( g( 24 ), g( 14 ) );
		lineTo( g( 30 ), g( 26 ) );
		lineTo( g( 6 ), g( 26 ) );
		closePath();
		fill();

		startPath( g( 30 ), g( 22 ) );
		lineTo( g( 25 ), g( 12 ) );

		lineTo( g( 4 ), g( 12 ) );
		addArc( g( 6 ), g( 6 ), g( 2 ), g( 2 ), 180, -90 );
		addArc( g( 14 ), g( 6 ), g( 2 ), g( 2 ), 90, -90 );
		addArc( g( 28 ), g( 8 ), g( 2 ), g( 2 ), 90, -90 );

		closePath();
		fill();
	}

	private void renderOld() {
		// Back
		startPath();
		moveTo( g( 6 ), g( 6 ) );
		lineTo( g( 4 ), g( 8 ) );
		lineTo( g( 4 ), g( 26 ) );
		lineTo( g( 28 ), g( 26 ) );
		lineTo( g( 28 ), g( 10 ) );
		lineTo( g( 26 ), g( 8 ) );
		lineTo( g( 14 ), g( 8 ) );
		lineTo( g( 12 ), g( 6 ) );
		closePath();
		fill();

		// Front
		startPath();
		moveTo( g( 2 ), g( 16 ) );
		lineTo( g( 4 ), g( 26 ) );
		lineTo( g( 28 ), g( 26 ) );
		lineTo( g( 26 ), g( 16 ) );
		closePath();
		fill( Color.BROWN );
	}

}
