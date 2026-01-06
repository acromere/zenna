package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;
import javafx.scene.paint.Color;

public class TerminalIcon extends RenderedIcon {

	public static void main( String[] args ) {
		proof( new TerminalIcon() );
	}

	@Override
	protected void render() {
		// Screen
		startPath();
		addArc( g( 5 ), g( 7 ), g( 2 ), g( 2 ), 90, 90 );
		addArc( g( 5 ), g( 25 ), g( 2 ), g( 2 ), 180, 90 );
		addArc( g( 27 ), g( 25 ), g( 2 ), g( 2 ), 270, 90 );
		addArc( g( 27 ), g( 7 ), g( 2 ), g( 2 ), 0, 90 );
		closePath();
		fill( Color.web( "#606060" ) );

		setDrawPaint( Color.web( "#e0e0e0" ) );

		// Arrow and prompt
		startPath();
		moveTo( g( 10 ), g( 12 ) );
		lineTo( g( 14 ), g( 16 ) );
		lineTo( g( 10 ), g( 20 ) );
		moveTo( g( 17 ), g( 21 ) );
		lineTo( g( 21 ), g( 21 ) );
		setStrokeWidth( g( 2 ) );
		draw();
	}

}
