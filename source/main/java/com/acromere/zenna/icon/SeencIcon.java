package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class SeencIcon extends SvgIcon {

	public static void main( String[] commands ) {
		proof( new SeencIcon() );
	}

	protected void define() {
		super.define();
		fill( "M2,14 L30,14 L18,4 L18,10 L2,10 Z" );
		fill( "M2,18 L14,28 L14,22 L30,22 L30,18 Z");

		// Triangles
		//fill( "M15,2 L12,16 L14,16 L17,30 L20,16 L18,16 Z" );

		// Thin
		//fill( "M16,1 L11,19 L16,19 L16,31 L21,13 L16,13 Z" );

		// Thick
		//add( "M17,3 L5,19 L18,19 L15,29 L27,13 L14,13 Z" );
	}


}
