package com.acromere.zenna.icon;

import com.acromere.zerra.image.Proof;
import javafx.scene.paint.Color;

public class WingArcLargeIcon extends WingArcIcon {

	public WingArcLargeIcon() {
		POINT_RADIUS = 3;
		DISC_RADIUS = 7;

		zx = 16;
		zy = 4;

		yx = 4;
		yy = 28;

		xx = 16;
		xy = 24;

		wx = 28;
		wy = 28;

		vx = 16;
		vy = 23;
	}

	public static void main( String[] commands ) {
		Proof.proof( new WingArcLargeIcon(), Color.web( "#206080" ), null );
	}

}
