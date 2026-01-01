package com.acromere.zenna.icon;

public class PauseIcon extends SymbolIcon {

	@Override
	protected void render() {
		startPath();
		addLine( g( 12 ), g( 16 - L ), g( 12 ), g( 16 + L ) );
		addLine( g( 20 ), g( 16 - L ), g( 20 ), g( 16 + L ) );
		closePath();
		draw();
	}

	public static void main( String[] commands ) {
		proof( new PauseIcon() );
	}

}
