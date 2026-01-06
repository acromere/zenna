package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;
import javafx.scene.paint.Color;

public class SouthBranchIcon extends RenderedIcon {

	double b = g( 32 );

	double c = g( 16 );

	double f = g( 4 );

	double g = g( 12 );

	double k = g( 6 );

	double q = g( 30 );

	double ze = g( 9 );

	public static void main( String[] args ) {
		//SouthBranchIcon icon = new SouthBranchIcon();
		//icon.setOpacity( 0.2 );
		//save( icon.setSize( 4096 ), "target/sbc-watermark.png" );

		proof( new SouthBranchIcon() );
		//save( new SouthBranchIcon().setSize( 4096 ), "target/sbc-transparent.png" );
	}

	@Override
	protected void render() {
		Color ringColor = Color.web( "#204080" );
		Color arrowColor = Color.LIGHTGRAY;
		Color outlineColor = Color.web( "#404040" );
		startPath();
		addOval( c, c, g, g );
		moveTo( c + ze, c );
		addOval( c, c, ze, ze );
		closePath();
		fill( ringColor );

		startPath();
		moveTo( b - f, k );
		lineTo( c, q );
		lineTo( f, k );
		lineTo( c, g );
		closePath();
		fill( arrowColor );
		setStrokeWidth( g( 1 ) );
		draw( outlineColor );

		startPath( c, g );
		lineTo( c, q );
		draw( outlineColor );
	}

}
