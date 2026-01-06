package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class CheckIcon extends SvgIcon {

	public static void main( String[] commands ) {
		proof( new CheckIcon() );
	}

	protected void define() {
		super.define();
		draw( "M9,16 L14,24 L23,6" );
	}

}
