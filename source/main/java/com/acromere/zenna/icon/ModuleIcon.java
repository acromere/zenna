package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class ModuleIcon extends RenderedIcon {

	private static final double sqrt3 = Math.sqrt( 3 );

	private static final double l = 3;

	private static final double g = 1;

	public static void main( String[] commands ) {
		proof( new ModuleIcon() );
	}

	@Override
	protected void render() {
		setStrokeWidth( g( l ) );
		block();
		spin( g( 16 ), g( 16 ), 120 );
		block();
		spin( g( 16 ), g( 16 ), 120 );
		block();
	}

	private void block() {
		double ax = 16;
		double ay = (16 - 0.5 * l) - g;
		startPath( g( ax ), g( ay ) );
		lineTo( g( ax - sqrt3 * l ), g( ay - l ) );
		lineTo( g( ax ), g( ay - 2 * l ) );
		lineTo( g( ax + sqrt3 * l ), g( ay - l ) );
		closePath();
		fill();
		draw();
	}

}
