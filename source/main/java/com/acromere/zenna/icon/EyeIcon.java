package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class EyeIcon extends SvgIcon {

	public static void main( String[] args ) {
		proof( new EyeIcon() );
	}

	protected void define() {
		super.define();

		// Iris
		//draw( "M12,16 A4,4,0,0,0,20,16 A4,4,0,0,0,12,16" );
		draw( "M10,16 A6,6,0,0,0,22,16 A6,6,0,0,0,10,16" );

		// Lids
		draw( "M2,16 A17.5,17.5,0,0,0,30,16 M2,16 A17.5,17.5,0,0,1,30,16", 2 );
	}

}
