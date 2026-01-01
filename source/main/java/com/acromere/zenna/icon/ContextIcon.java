package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class ContextIcon extends SvgIcon {

	protected void define() {
		super.define();
		fill( "M7,11L7,15L15,23L17,23L25,15L25,11Z" );
	}

	public static void main( String[] commands ) {
		proof( new ContextIcon() );
	}

}
