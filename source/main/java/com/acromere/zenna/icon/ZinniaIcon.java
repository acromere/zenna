package com.acromere.zenna.icon;

import com.acromere.zerra.color.Colors;
import com.acromere.zerra.image.RenderedIcon;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class ZinniaIcon extends RenderedIcon {

	private double centerRadius = 4;

	private int likeness = 5;

	private int layers = 2;

	public ZinniaIcon() {
		// This is a bit more advance example of how to have colors change for dark
		// and light themes. Since the theme switches on -fx-text-background-color
		// other colors can be configured to switch as well. In this case the
		// primary color is configured to use two different shades of hot pink.
		String hotPink = Colors.toString( Color.HOTPINK );
		String deepPink = Colors.toString( Color.HOTPINK.darker() );
		String saddleBrown = Colors.toString( Color.SADDLEBROWN );
		String deepBrown = Colors.toString( Color.SADDLEBROWN.darker() );

		String primary = "-fx-primary: ladder( -fx-text-background-color, " + deepPink + " 50%, " + hotPink + " 50% );";
		String secondary = "-fx-secondary: ladder( -fx-text-background-color, " + deepBrown + " 50%, " + saddleBrown + " 50% );";
		setStyle( primary + secondary );
	}

	@Override
	protected void render() {
		double spacing = 360.0 / likeness;
		double offset = spacing / layers;

		for( int layer = 0; layer < layers; layer++ ) {
			// Lower layer
			for( int index = 0; index < likeness; index++ ) {
				drawPetal(layer == 0 ?  getStrokePaint(): getPrimaryPaint() );
				spin( g( 16 ), g( 16 ), spacing );
			}
			// Upper layer
			spin( g( 16 ), g( 16 ), offset );
		}
		reset();

		drawCenter();
	}

	private void drawPetal( Paint paint ) {
		double n = 5;

		startPath( g( 15 ), g( 15 ) );
		curveTo( g( 14 ), g( 8 ), g( 16 - n ), g( 1 ), g( 16 ), g( 1 ) );
		curveTo( g( 16 + n ), g( 1 ), g( 18 ), g( 8 ), g( 17 ), g( 15 ) );
		closePath();

		fill( paint );
		//draw( Color.HOTPINK.darker() );
	}

	private void drawCenter() {
		Paint centerPaint = Color.SADDLEBROWN.darker();
		setDrawPaint( centerPaint );
		setFillPaint( centerPaint );
		startPath();
		addOval( g( 16 ), g( 16 ), g( centerRadius ), g( centerRadius ) );
		fill(getSecondaryPaint());

		drawStamen( 10 );
		drawStamen( 130 );
		drawStamen( 250 );
	}

	private void drawStamen( double angleInDegrees ) {
		double radius = 1.8;

		double x = radius * Math.cos( Math.toRadians( angleInDegrees ) );
		double y = radius * Math.sin( Math.toRadians( angleInDegrees ) );

		startPath();
		addOval( g( 16 + x ), g( 16 + y ), g(1), g(1) );
		fill( Color.YELLOW );
	}

	public static void main( String[] commands ) {
		//save( new ZinniaIcon(), "target/icons/zinnia.png" );
		proof( new ZinniaIcon() );
	}

}
