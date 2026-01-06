package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class DownloadIcon extends RenderedIcon {

	private static final double sqrt8 = Math.sqrt( 8 );

	private static final double sqrt32 = Math.sqrt( 32 );

	public static void main( String[] commands ) {
		proof( new DownloadIcon() );
	}

	@Override
	protected void render() {
		double y = 4;
		startPath( g( 16 ), g( y ) );
		lineTo( g( 16 ), g( y + 16 ) );
		moveTo( g( 8 ), g( y + 8 ) );
		lineTo( g( 16 ), g( y + 16 ) );
		lineTo( g( 24 ), g( y + 8 ) );
		draw();

		// Clip
		save();
		double cy = y + 16;
		double dy = cy - 16 + sqrt32;

		startPath( g( 0 ), g( dy ) );
		addArc( g( 16 ), g( cy ), g( 4 ), g( 4 ), 225, 90 );
		lineTo( g( 32 ), g( dy ) );
		lineTo( g( 32 ), g( 32 ) );
		lineTo( g( 0 ), g( 32 ) );
		closePath();
		clip();

		startPath( g( 16 ), g( cy + 4 ) );
		addArc( g( 16 ), g( cy + 4 ), g( 12 ), g( 6 ), 0, 360 );
		closePath();
		fill();
		restore();
	}

}
