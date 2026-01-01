package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class TagIcon extends SvgIcon {

	protected void define() {
		super.define();
		String tag = "M3,16 L9,9 L29,9 L29,23 L9,23 Z";
		tag += circle( 9, 16, 2 );
		fill( tag );
	}

	public static void main( String[] commands ) {
		proof( new TagIcon() );
	}

}
