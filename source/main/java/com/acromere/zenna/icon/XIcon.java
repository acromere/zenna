package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class XIcon extends RenderedIcon {

	private final double radius;

	private final double inset;

	private final double tr;

	public XIcon() {
		this( 3, 8 );
	}

	protected XIcon( double radius, double inset ) {
		this.radius = radius;
		this.inset = inset;
		this.tr = Math.sqrt( 2 * (this.radius * this.radius) );
	}

	public static void main( String[] commands ) {
		proof( new XIcon() );
	}

	protected double getRadius() {
		return radius;
	}

	protected double getInset() {
		return inset;
	}

	protected double getTr() {
		return tr;
	}

	@Override
	protected void render() {
		xPath();
		fill();
	}

	protected void xPath() {
		startPath();
		xTopOpen();
		xBottomOpen();
		closePath();
	}

	protected void xTopOpen() {
		lineTo( g( 16 + tr ), g( 16 ) );
		addArc( g( 32 - inset ), g( inset ), g( radius ), g( radius ), 315, 180 );
		lineTo( g( 16 ), g( 16 - tr ) );
		addArc( g( inset ), g( inset ), g( radius ), g( radius ), 45, 180 );
		lineTo( g( 16 - tr ), g( 16 ) );
	}

	protected void xBottomOpen() {
		lineTo( g( 16 - tr ), g( 16 ) );
		addArc( g( inset ), g( 32 - inset ), g( radius ), g( radius ), 135, 180 );
		lineTo( g( 16 ), g( 16 + tr ) );
		addArc( g( 32 - inset ), g( 32 - inset ), g( radius ), g( radius ), 225, 180 );
		lineTo( g( 16 + tr ), g( 16 ) );
	}

}
