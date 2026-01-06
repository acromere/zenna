package com.acromere.zenna.icon;

public class UpdateIcon extends RefreshIcon {

	public static void main( String[] commands ) {
		proof( new UpdateIcon() );
	}

	@Override
	protected void render() {
		spin( g( 16 ), g( 16 ), -90 );
		super.render();
	}

}
