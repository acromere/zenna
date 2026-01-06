package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class ArrowDownIcon extends ArrowIcon {

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ArrowDownIcon() );
	}

	protected void rotate() {
		spin( g( 16 ), g( 16 ), 180 );
	}

}
