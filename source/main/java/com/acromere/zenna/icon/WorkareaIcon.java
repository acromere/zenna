package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class WorkareaIcon extends SvgIcon {

	protected void define() {
		super.define();

		String borderOut = "M2,4 L2,28 L30,28 L30,4 Z";
		String borderIn = "M4,6 L4,26 L28,26 L28,6 Z";
		String workarea = "M6,8 L6,24 L26,24 L26,8 Z";

		String icon = borderOut + " " + borderIn + " " + workarea;
		fill( icon );
	}

	public static void main( String[] commands ) {
		proof( new WorkareaIcon() );
	}

}
