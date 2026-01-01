package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class MinimizeIcon extends SvgIcon {

	protected void define() {
		super.define();
		draw("M 6,16 L 26,16" );
	}

	public static void main( String[] commands ) {
		proof( new MinimizeIcon() );
	}

}
