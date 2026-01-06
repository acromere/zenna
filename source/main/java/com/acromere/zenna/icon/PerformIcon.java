package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class PerformIcon extends SvgIcon {

	public static void main( String[] commands ) {
		proof( new PerformIcon() );
	}

	protected void define() {
		super.define();
		double ox = 16;
		double oy = 12;
		draw( "M" + ox + "," + oy + " L" + ox + "," + oy );
		draw( "M" + ox + "," + (oy + 6) + " L" + ox + ",32" );

		draw( arc( true, ox, oy, 5, 135, 90 ), 2 );
		draw( arc( true, ox, oy, 9, 135, 90 ), 2 );
		draw( arc( true, ox, oy, 13, 135, 90 ), 2 );

		draw( arc( true, ox, oy, 5, 45, -90 ), 2 );
		draw( arc( true, ox, oy, 9, 45, -90 ), 2 );
		draw( arc( true, ox, oy, 13, 45, -90 ), 2 );
	}

}
