package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class MinimizeIcon extends SvgIcon {

	public static void main( String[] commands ) {
		proof( new MinimizeIcon() );
	}

	protected void define() {
		super.define();
		draw( "M 6,16 L 26,16" );
	}

}
