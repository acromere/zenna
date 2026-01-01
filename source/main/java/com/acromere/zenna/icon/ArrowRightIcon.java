package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class ArrowRightIcon extends ArrowIcon {

	protected void rotate() {
		spin( g( 16 ), g( 16 ), 90 );
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ArrowRightIcon() );
	}

}
