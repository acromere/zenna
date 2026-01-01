package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class TitleIcon extends SvgIcon {

	protected void define() {
		super.define();
		fill( "M1,11 L31,11 L26,16 L31,21 L1,21 L6,16 Z" );
	}

	public static void main( String[] commands ) {
		proof( new TitleIcon() );
	}

}
