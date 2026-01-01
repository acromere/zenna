package com.acromere.zenna.icon;

import com.acromere.zerra.image.RenderedIcon;
import com.acromere.zerra.image.VectorImage;

public class ToggleIcon extends RenderedIcon {

	private boolean enabled;

	public ToggleIcon() {
		this( false );
	}

	public ToggleIcon( Boolean enabled ) {
		this.enabled = enabled;
	}

	@Override
	protected void render() {
		startPath();
		addArc( g( 8 ), g( 16 ), g( 8 ), g( 8 ), 90, 180 );
		addArc( g( 24 ), g( 16 ), g( 8 ), g( 8 ), 270, 180 );
		if( enabled ) {
			moveTo( g( 24 ), g( 16 ) );
			addArc( g( 24 ), g( 16 ), g( 6 ), g( 6 ), 0, 360 );
		} else {
			moveTo( g( 8 ), g( 16 ) );
			addArc( g( 8 ), g( 16 ), g( 6 ), g( 6 ), 0, 360 );
		}
		closePath();
		fill();
	}

	@Override
	public <T extends VectorImage> T copy() {
		T copy = super.copy();
		((ToggleIcon)copy).enabled = this.enabled;
		return copy;
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ToggleIcon( false ) );
	}

}
