package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class Hamburger4Icon extends RenderedIcon {

	private static final double spacing = 8;

	private static final double r1 = 4;

	private static final double r2 = r1 + spacing;

	private static final double r3 = r2 + spacing;

	private static final double r4 = r3 + spacing;

	private static final double margin = 4;

	private static final double e = margin;

	private static final double w = 32 - margin;

	@Override
	protected void render() {
		startPath();
		addRow( r1 );
		addRow( r2 );
		addRow( r3 );
		addRow( r4 );
		closePath();

		setStrokeWidth(3);
		draw();
	}

	private void addRow( double y ) {
		addLine( g( e ), g( y ), g( w ), g( y ) );
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new Hamburger4Icon() );
	}

}
