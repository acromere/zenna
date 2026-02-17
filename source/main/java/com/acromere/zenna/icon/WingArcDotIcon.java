package com.acromere.zenna.icon;

import com.acromere.zerra.image.Proof;
import javafx.scene.paint.Color;

public class WingArcDotIcon extends WingArcLargeIcon {

	protected double ACRO_RADIUS;

	public WingArcDotIcon() {
		calculateNumbers();
	}

	public static void main( String[] commands ) {
		Proof.proof( new WingArcDotIcon(), Color.web( "#206080" ), null );
	}

	@Override
	protected void define() {
		super.define();

		fill( wing() );
		fill( acromere(), getPrimaryPaint() );
	}

	private String acromere() {
		return circle( zx, zy, POINT_RADIUS );
	}

	protected String wing() {
		StringBuilder wing = new StringBuilder();

		wing.append( arc( true, zx, zy, ACRO_RADIUS, frontStartAngleDeg, frontSpanAngleDeg ) );
		wing.append( "L" ).append( bx ).append( "," ).append( by ).append( " " );
		wing.append( arc( yx, yy, POINT_RADIUS, -leftArcStartAngleDeg, -leftArcSpanAngleDeg ) );
		wing.append( arc( tx, ty, BACK_RADIUS, -backArcStartAngleDeg, -backArcSpanAngleDeg ) );
		wing.append( arc( wx, wy, POINT_RADIUS, -rightArcStartAngleDeg, -rightArcSpanAngleDeg ) );
		wing.append( "Z" );

		return wing.toString();
	}

	@Override
	protected void calculateNumbers() {
		super.calculateNumbers();

		ACRO_RADIUS = POINT_RADIUS + 2;
	}

}
