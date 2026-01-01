package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;
import javafx.scene.paint.Color;

public class BellIcon extends SvgIcon {

    public BellIcon() {
        this( null );
    }

    public BellIcon( Color color ) {
        this( color, false );
    }

    public BellIcon( boolean vibrate ) {
        this( null, vibrate );
    }

    public BellIcon( Color color, boolean vibrate ) {
        setStrokePaint( color );

        // Bell
        fill( "M4,24C4,18,8,20,8,10A5,5,0,0,1,24,10C24,20,28,18,28,24" );

        // Gong
        fill( "M13,26L19,26A3,3,0,0,1,13,26" );

        // Vibrate
        if (vibrate) {
            draw( "M4,12 A14,14,0,0,1,6,4" );
            draw( "M28,12 A14,14,0,0,0,26,4" );
        }
    }

    public static void main( String[] commands ) {
        proof( new BellIcon( true ) );
    }

}
