package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;
import com.acromere.zerra.image.VectorIcon;
import com.acromere.zerra.image.VectorImageWriter;
import javafx.application.Platform;

import java.nio.file.Path;
import java.nio.file.Paths;

public class HexagonIcon extends SvgIcon {

	private final double a;

	private final double b;

	private final double c;

	public HexagonIcon() {
		a = Math.cos( Math.toRadians( 30 ) );
		b = Math.sin( Math.toRadians( 30 ) );
		c = 16;
	}

	protected void define() {
		super.define();
		double r = 10;
		draw( generateHexagon( r ), 1.5 );
		fill( generateAtoms( r, 3 ) );
	}

	private String generateHexagon( double r ) {
		double x = r * a;
		double y = r * b;

		String path = "M" + (c + x) + "," + (c - y);
		path += " " + c + "," + (c - r);
		path += " " + (c - x) + "," + (c - y);
		path += " " + (c - x) + "," + (c + y);
		path += " " + c + "," + (c + r);
		path += " " + (c + x) + "," + (c + y);
		path += " Z";

		return path;
	}

	private String generateAtoms( double r, double size ) {
		double x = r * a;
		double y = r * b;

		String path = circle( c + x, c - y, size );
		path += circle( c, c - r, size );
		path += circle( c - x, c - y, size );
		path += circle( c - x, c + y, size );
		path += circle( c, c + r, size );
		path += circle( c + x, c + y, size );

		return path;
	}

	public static void main( String[] commands ) {
		proof( new HexagonIcon() );
		try {
			//new VectorImageWriter().save( new HexagonIcon(), Paths.get( "target","hexagon.png" ), 2048, 2048 );
			Path home = Paths.get( System.getProperty( "user.home" ) );
			Path icons = home.resolve( "Profile/etc/icons" );
			new VectorImageWriter().save( (VectorIcon)new HexagonIcon().resize( 2048 ), icons.resolve( "graphene.png" ) );
			Platform.exit();
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}

}
