package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class SeencIcon extends SvgIcon {

	public static void main( String[] commands ) {
		proof( new SeencIcon() );
	}

	protected void define() {
		super.define();

		double B = 2;
		double C = 16;
		double E = 32;
		double D = 1;
		double S = 2;
		double T = S + 4;
		double U = T + 4;

		fill( "M" + B + "," + (C - S) + " L" + (E - B) + "," + (C - S) + " L" + (C + D) + "," + (C - U) + " L" + (C + D) + "," + (C - T) + " L" + B + "," + (C - T) + " Z" );
		fill( "M" + B + "," + (C + S) + " L" + (C - D) + "," + (C + U) + " L" + (C - D) + "," + (C + T) + " L" + (E - B) + "," + (C + T) + " L" + (E - B) + "," + (C + S) + " Z" );
	}

}
