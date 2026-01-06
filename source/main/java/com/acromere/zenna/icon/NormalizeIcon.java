package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class NormalizeIcon extends SvgIcon {

	public static void main( String[] commands ) {
		proof( new NormalizeIcon() );
	}

	protected void define() {
		super.define();
		draw( "M4,10 L10,10 L10,4" );
		draw( "M22,4 L22,10 L28,10" );
		draw( "M28,22 L22,22 L22,28" );
		draw( "M10,28 L10,22 L4,22" );
	}

}

