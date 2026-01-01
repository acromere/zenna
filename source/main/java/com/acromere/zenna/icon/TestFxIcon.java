package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;
import com.acromere.zerra.image.VectorImageWriter;
import javafx.scene.paint.Color;

import java.nio.file.Path;

public class TestFxIcon extends SvgIcon {

	private static final Color lightStroke = Color.web( "#b0b0b0" );

	private static final Color darkStroke = Color.web( "#303030" );

	private static final Color color = Color.web( "#208040" );

	private final String chip;

	private final String smallChip;

	private final String outline;

	private final String check;

	public TestFxIcon() {
		this( color, darkStroke, false );
	}

	public TestFxIcon( Color base, Color stroke, boolean outlined ) {
		// For use without an outline
		chip = circle( 16, 16, 14 );

		// For use with the outline
		smallChip = circle( 16, 16, 14 );

		// The outline
		outline = circle( 16, 16, 16 ) + circle( 16, 16, 12 );

		// The checkmark
		check = "M10,18 L14,24 L21,10";

		if( base != null ) fill( chip, base );
		if( outlined ) fill( outline, stroke );
		draw( check, stroke );
	}

	public static void main( String[] commands ) {
		try {
			new VectorImageWriter().save( new TestFxIcon( color, darkStroke, false ), Path.of( System.getProperty( "user.dir" ), "testfx-icon-a.png" ) );
			new VectorImageWriter().save( new TestFxIcon( color, darkStroke, true ), Path.of( System.getProperty( "user.dir" ), "testfx-icon-b.png" ) );
			new VectorImageWriter().save( new TestFxIcon( color, lightStroke, false ), Path.of( System.getProperty( "user.dir" ), "testfx-icon-c.png" ) );
			new VectorImageWriter().save( new TestFxIcon( color, lightStroke, true ), Path.of( System.getProperty( "user.dir" ), "testfx-icon-d.png" ) );

			new VectorImageWriter().save( new TestFxIcon( darkStroke, color, false ), Path.of( System.getProperty( "user.dir" ), "testfx-icon-e.png" ) );
			new VectorImageWriter().save( new TestFxIcon( darkStroke, color, true ), Path.of( System.getProperty( "user.dir" ), "testfx-icon-f.png" ) );
			new VectorImageWriter().save( new TestFxIcon( lightStroke, color, false ), Path.of( System.getProperty( "user.dir" ), "testfx-icon-g.png" ) );
			new VectorImageWriter().save( new TestFxIcon( lightStroke, color, true ), Path.of( System.getProperty( "user.dir" ), "testfx-icon-h.png" ) );
		} catch( Exception exception ) {
			exception.printStackTrace( System.out );
		}
		proof( new TestFxIcon() );
	}

}
