package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class MagnifierIcon extends SvgIcon {

	public static void main( String[] commands ) {
		proof( new MagnifierIcon() );
	}

	protected void define() {
		super.define();

		// Handle
		clip( "M 0,0 L32,0 L32,32 L0,32 Z " + circle( 12, 12, 12 ) );
		fill( ellipse( 24, 24, 4, 1.5, 45 ) );

		// Glass
		restore();
		draw( circle( 12, 12, 9 ), 0.5 * getStrokeWidth() );
	}

}
