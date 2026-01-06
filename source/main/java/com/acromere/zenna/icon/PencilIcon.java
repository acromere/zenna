package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class PencilIcon extends SvgIcon {

	public static void main( String[] commands ) {
		proof( new PencilIcon() );
	}

	protected void define() {
		super.define();
		double width = 4;
		double halfW = 0.5 * width;
		double w = 0.5 * width * Math.sqrt( 2 );
		double h = 0.5 * w;

		fill( "M" + (28 - halfW) + "," + (4 - halfW) + " A" + w + "," + h + ",45,1,1," + (28 + halfW) + "," + (4 + halfW) + " L" + (26 + halfW) + "," + (6 + halfW) + " L" + (26 - halfW) + "," + (6 - halfW) + " Z" );
		fill( "M" + (24 - halfW) + "," + (8 - halfW) + " L" + (24 + halfW) + "," + (8 + halfW) + " L" + (10 + halfW) + "," + (22 + halfW) + " L" + (10 - halfW) + "," + (22 - halfW) + " Z" );
		fill( "M" + (8 - halfW) + "," + (24 - halfW) + " L" + (8 + halfW) + "," + (24 + halfW) + " L2,30 Z" );
	}

}
