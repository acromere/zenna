package com.acromere.zenna.icon;

public class ProductIcon extends ModuleIcon {

	@Override
	protected void render() {
		super.render();

		setStrokeWidth( g(2) );
		startPath();
		addOval( g( 16 ), g( 16 ), g( 13 ), g( 13 ) );
		closePath();
		draw();
	}

	public static void main( String[] commands ) {
		proof( new ProductIcon() );
	}

}
