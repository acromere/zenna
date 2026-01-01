package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;
import javafx.scene.shape.StrokeLineCap;

public class UnindentIcon extends RenderedIcon {

	@Override
	protected void render() {
		setDrawWidth( g(2) );
		startPath();
		moveTo( g( 13 ), g( 11 ) );
		lineTo( g( 7 ), g( 16 ) );
		lineTo( g( 13 ), g( 21 ) );
		closePath();
		fill();
		draw();

		setDrawCap( StrokeLineCap.BUTT );
		setDrawWidth( g( 2 ) );
		startPath();
		addLine( g( 6 ), g( 7 ), g( 26 ), g( 7 ) );
		addLine( g( 16 ), g( 13 ), g( 26 ), g( 13 ) );
		addLine( g( 16 ), g( 19 ), g( 26 ), g( 19 ) );
		addLine( g( 6 ), g( 25 ), g( 26 ), g( 25 ) );
		draw();
	}

	public static void main( String[] commands ) {
		proof( new UnindentIcon() );
	}

}
