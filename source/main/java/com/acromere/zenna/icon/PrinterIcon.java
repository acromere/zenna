package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class PrinterIcon extends SvgIcon {

	protected void define() {
		super.define();
		fill("M 8,6 L 24,6 24,4 A 2 2 0 0 0 22,2 L 10,2 A 2 2 0 0 0 8,4 Z");
		fill( "M 2,20 L 6,20 6,18 A 2 2 0 0 1 8,16 L 24,16 A 2 2 0 0 1 26,18 L 26,20 30,20 30,10 A 2 2 0 0 0 28,8 L 4,8 A 2 2 0 0 0 2,10 Z M 22,10 L 22,12 26,12 26,10 Z");
		draw("M 9,19 L 9,29 23,29 23,19 Z", 0.5 * getStrokeWidth() );
	}

	public static void main( String[] commands ) {
		proof( new PrinterIcon() );
	}

}
