package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class CollapseIcon extends SvgIcon {

	protected void define() {
		super.define();
		draw( "M10,4 L16,10 L22,4" );
		draw( "M4,16 L28,16" );
		draw( "M10,28 L16,22 L22,28" );
	}

	public static void main( String[] commands ) {
		proof( new CollapseIcon() );
	}

}
