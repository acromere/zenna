package com.acromere.zenna.icon;

public class MinusIcon extends SymbolIcon {

	@Override
	protected void render() {
		startPath();
		addLine( g( 16 - L ), g( 16 ), g( 16 + L ), g( 16 ) );
		closePath();
		draw();
	}

	public static void main( String[] commands ) {
		proof( new MinusIcon() );
	}

}
