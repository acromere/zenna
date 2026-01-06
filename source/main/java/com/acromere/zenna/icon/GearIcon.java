package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class GearIcon extends SvgIcon {

	private static final int TOOTH_COUNT = 6;

	private static final double TOOTH_WIDTH = 2;

	private static final double C = 16;

	private static final double OUTER_RADIUS = 14;

	private static final double INNER_RADIUS = 10;

	private static final double AXEL_RADIUS = 5;

	private static final double SPIN = 0.5 * Math.PI;

	private static final double ANGLE = 2 * Math.PI / TOOTH_COUNT;

	private static final double ANGLE_OVER_2 = 0.5 * ANGLE;

	public static void main( String[] parameters ) {
		proof( new GearIcon() );
	}

	protected void define() {
		super.define();
		StringBuilder path = new StringBuilder();
		for( int index = 0; index < TOOTH_COUNT; index++ ) {
			double angle = SPIN + index * ANGLE;
			path.append( tooth( angle, index == 0 ? "M" : "L" ) );
		}
		path.append( "Z" );
		path.append( circle( C, C, AXEL_RADIUS ) );
		fill( path.toString() );
	}

	private String tooth( double angle, String command ) {
		double oda = Math.atan2( TOOTH_WIDTH, OUTER_RADIUS );
		double oa1 = angle - oda;
		double oa2 = angle + oda;
		double ox1 = C + OUTER_RADIUS * Math.cos( oa1 );
		double oy1 = C + OUTER_RADIUS * Math.sin( oa1 );
		double ox2 = C + OUTER_RADIUS * Math.cos( oa2 );
		double oy2 = C + OUTER_RADIUS * Math.sin( oa2 );

		double ia = angle + ANGLE_OVER_2;
		double ida = Math.atan2( TOOTH_WIDTH, INNER_RADIUS );
		double ia1 = ia - ida;
		double ia2 = ia + ida;
		double ix1 = C + INNER_RADIUS * Math.cos( ia1 );
		double iy1 = C + INNER_RADIUS * Math.sin( ia1 );
		double ix2 = C + INNER_RADIUS * Math.cos( ia2 );
		double iy2 = C + INNER_RADIUS * Math.sin( ia2 );

		return " " + command + " " + ox1 + " " + oy1 + " L " + ox2 + " " + oy2 + " L " + ix1 + " " + iy1 + " L " + ix2 + " " + iy2;
	}

}
