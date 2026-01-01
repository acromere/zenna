package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;
import com.acromere.zerra.image.VectorImageWriter;
import javafx.scene.paint.Color;

import java.nio.file.Path;

public class MountainIcon extends SvgIcon {

	public MountainIcon() {
		this( null );
	}

	public MountainIcon( Color color ) {
		if( color == null ) {
			fill( mountain() );
		} else {
			fill( mountain(), color );
		}
	}

	private String mountain() {
		double offset = Math.sqrt( 0.5 );
		return circle( 16, 16, 15 ) + "M 14,8 l 5,5 -7,9 10,-10 " + (6 + offset) + " " + (6 + offset) + " A 13 13 0 1 0 " + (4 - offset) + "," + (18 + offset);
	}

	public static void main( String[] parameters ) {
		proof( new MountainIcon( Color.LIGHTSLATEGREY ) );

//		try {
//			save( 2048, null, "mountain.png" );
//			save( 2048, "#80808080", "mountain-background.png" );
//		} catch( Exception e ) {
//			e.printStackTrace();
//		} finally {
//			Platform.exit();
//		}
	}

	private static void save( int size, String color, String name ) throws Exception {
		MountainIcon icon = new MountainIcon();
		if( color != null ) icon = new MountainIcon( Color.web( color ) );
		new VectorImageWriter().save( (MountainIcon)icon.resize( size ), Path.of( System.getProperty( "user.home" ) + "/Profile/etc/icons/" + name ) );
	}

}
