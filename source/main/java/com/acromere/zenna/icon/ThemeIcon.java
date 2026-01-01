package com.acromere.zenna.icon;

import com.acromere.zerra.color.Colors;
import com.acromere.zerra.image.RenderedIcon;
import javafx.scene.paint.Color;

public class ThemeIcon extends RenderedIcon {

	@Override
	protected void render() {
		Color d = Color.web( "804080");
		Color d0 = Colors.mix( d, Color.WHITE, 0.6 );
		Color d1 = Colors.mix( d, Color.WHITE, 0.4 );
		Color d2 = Colors.mix( d, Color.WHITE, 0.2 );
		Color f = Color.web( "404080" );
		Color f0 = Colors.mix( f, Color.WHITE, 0.6 );
		Color f1 = Colors.mix( f, Color.WHITE, 0.4 );
		Color f2 = Colors.mix( f, Color.WHITE, 0.2 );
		Color g = Color.web( "408040");
		Color g0 = Colors.mix( g, Color.WHITE, 0.6 );
		Color g1 = Colors.mix( g, Color.WHITE, 0.4 );
		Color g2 = Colors.mix( g, Color.WHITE, 0.2 );

		renderSwatch( g0, g1, g2 );
		spin( g( 6 ), g( 26 ), -45 );
		renderSwatch( f0, f1, f2 );
		spin( g( 6 ), g( 26 ), -45 );
		renderSwatch( d0, d1, d2 );

		startPath();
		addArc( g( 6 ), g( 26 ), g( 5 ), g( 5 ), 0, 360 );
		closePath();
		fill( Color.web( "808080") );

		startPath();
		addArc( g( 6 ), g( 26 ), g( 2 ), g( 2 ), 0, 360 );
		closePath();
		fill(Color.web( "606060"));
	}

	private void renderSwatch( Color a, Color b, Color c ) {
		double w = 8;
		double h = 10;

		//		startPath();
		//		//moveTo( g( 6 ), g( 31 ) );
		//		addArc( g( 6 ), g( 26 ), g( 5 ), g( 5 ), 90, 180 );
		//		lineTo( g( 31 ), g( 31 ) );
		//		lineTo( g( 31 ), g( 21 ) );
		//		closePath();
		//		fillAndDraw();

		startPath();
		addRect( g( 7 ), g( 21 ), g( w ), g( h ) );
		closePath();
		fill( a );

		startPath();
		addRect( g( 15 ), g( 21 ), g( w ), g( h ) );
		closePath();
		fill( b );

		startPath();
		addRect( g( 23 ), g( 21 ), g( w ), g( h ) );
		closePath();
		fill( c );
	}

	public static void main( String[] args ) {
		proof( new ThemeIcon() );
	}

}
