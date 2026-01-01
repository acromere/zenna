package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class FileSystemIcon extends RenderedIcon {

	private final double w = 13;

	private final double h = 5;

	private final double s = 4;

	@Override
	protected void render() {
		move( g( 0 ), g( 1.5 * s ) );
		renderStack();
		move( g( 0 ), g( -s ) );
		renderStack();
		move( g( 0 ), g( -s ) );
		renderStack();
		move( g( 0 ), g( -s ) );
		renderDisk();
	}

	private void renderStack() {
		save();
		startPath( g( 0 ), g( 16 - s ) );
		lineTo( g( 16 - w ), g( 16 - s ) );
		addArc( g( 16 ), g( 16 - s ), g( w + 2 ), g( h + 2 ), 180, 180 );
		lineTo( g( 32 ), g( 16 - s ) );
		lineTo( g( 32 ), g( 32 ) );
		lineTo( g( 0 ), g( 32 ) );
		closePath();
		clip();
		startPath( g( 16 - w ), g( 16 - s ) );
		lineTo( g( 16 - w ), g( 16 ) );
		addArc( g( 16 ), g( 16 ), g( w ), g( h ), 180, 180 );
		lineTo( g( 16 + w ), g( 16 - s ) );
		fill();
		restore();
	}

	private void renderDisk() {
		startPath();
		addOval( g( 16 ), g( 16 ), g( w ), g( h ) );
		closePath();
		fill();
	}

	public static void main( String[] args ) {
		proof( new FileSystemIcon() );
	}

}
