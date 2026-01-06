package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class ExpandIcon extends SvgIcon {

	public static void main( String[] commands ) {
		proof( new ExpandIcon() );
	}

	protected void define() {
		super.define();
		draw( "M4,2 L28,2" );
		draw( "M10,12 L16,6 L22,12 M10,20 L16,26 L22,20" );
		draw( "M4,30 L28,30" );
	}

}
