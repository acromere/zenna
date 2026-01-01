package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class CloseToolIcon extends RenderedIcon {

	private final int s = 6;

	public CloseToolIcon() {}

	@Override
	protected void render() {
		int a = 16 - s;
		int b = 16 + s;

		startPath(g( a ), g( a ));
		lineTo( g( b ), g( b ) );
		moveTo( g( a ), g( b ) );
		lineTo( g( b ), g( a ) );
		draw();
	}

	public static void main( String[] commands ) {
		proof( new CloseToolIcon() );
	}

}
