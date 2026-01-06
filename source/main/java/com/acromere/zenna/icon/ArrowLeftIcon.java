package com.acromere.zenna.icon;

public class ArrowLeftIcon extends ArrowIcon {

	public static void main( String[] commands ) {
		proof( new ArrowLeftIcon() );
	}

	@Override
	protected void rotate() {
		spin( g( 16 ), g( 16 ), -90 );
	}

}
