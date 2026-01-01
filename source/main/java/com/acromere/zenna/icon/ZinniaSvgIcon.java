package com.acromere.zenna.icon;

import com.acromere.zerra.color.Colors;
import com.acromere.zerra.image.SvgIcon;
import javafx.scene.paint.Color;

public class ZinniaSvgIcon extends SvgIcon {

	private final double centerRadius = 4;

	private int likeness = 5;

	private int layers = 2;

	protected void define() {
		super.define();

		String hotPink = Colors.toString( Color.HOTPINK );
		String deepPink = Colors.toString( Color.HOTPINK.darker() );
		String saddleBrown = Colors.toString( Color.SADDLEBROWN );
		String deepBrown = Colors.toString( Color.SADDLEBROWN.darker() );
		String primary = "-fx-primary: ladder( -fx-text-background-color, " + deepPink + " 50%, " + hotPink + " 50% );";
		String secondary = "-fx-secondary: ladder( -fx-text-background-color, " + deepBrown + " 50%, " + saddleBrown + " 50% );";
		setStyle( primary + secondary );

		// Petals
		double spacing = 360.0 / likeness;
		double offset = spacing / layers;
		for( int layer = 0; layer < layers; layer++ ) {
			for( int index = 0; index < likeness; index++ ) {
				double angle = index * spacing + layer * offset;
				fill( petal( angle ), layer == 0 ? null : PRIMARY );
			}
		}

		// Center
		fill( circle( 16, 16, centerRadius ), SECONDARY );

		// Stamen
		fill( stamen( 10 ), Color.YELLOW );
		fill( stamen( 130 ), Color.YELLOW );
		fill( stamen( 250 ), Color.YELLOW );
	}

	private String petal( double angle ) {
		double cx = 16;
		double cy = 16;

		String petal = "";

		petal += "M" + rotate( 15, 15, cx, cy, angle );
		petal += "C" + rotate( 14, 8, cx, cy, angle );
		petal += "," + rotate( 11, 1, cx, cy, angle );
		petal += "," + rotate( 16, 1, cx, cy, angle );
		petal += "C" + rotate( 21, 1, cx, cy, angle );
		petal += "," + rotate( 18, 8, cx, cy, angle );
		petal += "," + rotate( 17, 15, cx, cy, angle );
		petal += "Z";

		return petal;
	}

	private String stamen( double angleInDegrees ) {
		double radius = 1.8;
		double x = radius * Math.cos( Math.toRadians( angleInDegrees ) );
		double y = radius * Math.sin( Math.toRadians( angleInDegrees ) );
		return circle( 16 + x, 16 + y, 1 );
	}

	public static void main( String[] commands ) {
		proof( new ZinniaSvgIcon() );
	}

}
