package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class DisableIcon extends RenderedIcon {

	public static void main( String[] commands ) {
		proof( new DisableIcon() );
	}

	@Override
	protected void render() {
		double r1 = 8;
		double r2 = 12;
		double t = r2 - r1;
		double alpha = Math.toDegrees( Math.atan2( 0.5 * t, r1 ) );
		double theta = Math.toRadians( 45 - alpha );
		double x = r1 * Math.sin( theta );
		double y = r1 * Math.cos( theta );

		startPath();
		addOval( g( 16 ), g( 16 ), g( r2 ), g( r2 ) );

		moveTo( g( 16 + x ), g( 16 - y ) );
		addArc( g( 16 ), g( 16 ), g( r1 ), g( r1 ), 45 + alpha, 180 - 2 * alpha );
		closePath();

		moveTo( g( 16 - x ), g( 16 + y ) );
		addArc( g( 16 ), g( 16 ), g( r1 ), g( r1 ), 225 + alpha, 180 - 2 * alpha );
		closePath();

		fill();
	}

}
