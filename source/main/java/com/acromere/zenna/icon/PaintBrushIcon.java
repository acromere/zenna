package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class PaintBrushIcon extends SvgIcon {

	public PaintBrushIcon() {
		String outline = "M22,18";
		outline += " A4,4 0 0 0 26,22";
		outline += " A4,4 0 1 1 22,26";
		outline += " A4,4 0 0 0 18,22";
		outline += " C14,22 14,26 10,22";
		outline += " L22,10";
		outline += " C26,14 22,14 22,18";
		outline += " Z";
		fill( outline );

		String brush = "M8,20 L2,14, L14,2 L20,8 Z";
		fill( brush );
	}

	public static void main( String[] parameters ) {
		proof( new PaintBrushIcon() );
	}

}
