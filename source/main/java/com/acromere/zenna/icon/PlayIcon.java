package com.acromere.zenna.icon;

public class PlayIcon extends SymbolIcon {

	@Override
	protected void render() {
		startPath();
		moveTo( g( 16 - L ), g( 16 - L ) );
		lineTo( g( 16 - L ), g( 16 + L ) );
		lineTo( g( 16 + L ), g( 16 ) );
		closePath();
		fill();
		draw();
	}

	public static void main( String[] commands ) {
		proof( new PlayIcon() );
	}

}
