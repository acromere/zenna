package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;

public class TaskQueueIcon extends RenderedIcon {

	public static void main( String[] commands ) {
		proof( new TaskQueueIcon() );
	}

	@Override
	protected void render() {
		// Bars
		//		startPath();
		//		moveTo( g( 8 ), g( 4 ) );
		//		lineTo( g( 8 ), g( 28 ) );
		//		moveTo( g( 24 ), g( 4 ) );
		//		lineTo( g( 24 ), g( 28 ) );
		//		closePath();
		//		draw();

		startPath();
		addArc( g( 16 - 32 ), g( 16 ), g( 24 ), g( 24 ), 30, -60 );
		draw();
		startPath();
		addArc( g( 16 + 32 ), g( 16 ), g( 24 ), g( 24 ), 150, 60 );
		draw();

		// Tasks
		int r = 3;
		startPath();
		moveTo( g( 16 ), g( 6 ) );
		addArc( g( 16 ), g( 6 ), g( r ), g( r ), 0, 360 );
		moveTo( g( 16 ), g( 16 ) );
		addArc( g( 16 ), g( 16 ), g( r ), g( r ), 0, 360 );
		moveTo( g( 16 ), g( 26 ) );
		addArc( g( 16 ), g( 26 ), g( r ), g( r ), 0, 360 );
		closePath();
		fill();
	}

}
