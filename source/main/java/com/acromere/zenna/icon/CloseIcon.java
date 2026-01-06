package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;
import com.acromere.zerra.image.SvgIcon;

public class CloseIcon extends SvgIcon {

	public static void main( String[] commands ) {
		RenderedIcon.proof( new CloseIcon() );
	}

	protected void define() {
		super.define();
		draw( "M8,8L24,24" );
		draw( "M8,24L24,8" );
	}

}
