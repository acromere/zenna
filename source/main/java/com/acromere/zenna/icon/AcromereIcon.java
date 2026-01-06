package com.acromere.zenna.icon;

import com.acromere.zerra.image.Proof;
import javafx.scene.paint.Color;

public class AcromereIcon extends WingArcIcon {

	public static void main( String[] commands ) {
		Proof.proof( new AcromereIcon(), Color.web( "#206080" ), null );
	}

	@Override
	protected void define() {
		super.define();

		//fill( acromere() );

		fill( wing() );
	}

	private String acromere() {
		return circle( zx, zy, POINT_RADIUS );
	}

	protected String wing() {
		return super.wing();
	}

}
