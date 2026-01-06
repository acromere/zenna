package com.acromere.zenna.icon;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Stop;

import java.util.ArrayList;
import java.util.List;

/**
 * Use <a href="http://www.pic2icon.com/windows7_vista_icon_generator.php">Pic2Icon</a> to convert to Windows icon.
 */
public class XRingIcon extends XIcon {

	// White
	static final Color RING_HIGHLIGHT = Color.web( "#FFFFFF" );

	// Indigo 300
	static final Color RING_BASE = Color.web( "#7986CB" );

	// Yellow 200
	static final Color JET_CENTER = Color.web( "#FFF59D" );

	// Orange 500
	static final Color JET_TIP = Color.web( "#FF9800" );

	private final double outerTilt;

	private final double innerTilt;

	private final double outerRingMax;

	private final double innerRingMax;

	private final double outerRingMin;

	private final double innerRingMin;

	public XRingIcon() {
		this( 3, 8 );
	}

	public XRingIcon( double radius, double inset ) {
		super( radius, inset );

		// Example how to override the style
		//setStyle( "-fx-stroke: #404040;-fx-accent-color: -fx-accent;" );
		//setStyle( "-fx-stroke: #C0C0C0;-fx-accent-color: -fx-accent;" );

		outerTilt = 12.0 / 16.0;
		innerTilt = 10.0 / 16.0;
		outerRingMax = 16 + getRadius() - getInset();
		outerRingMin = outerRingMax * outerTilt;
		innerRingMax = getTr();
		innerRingMin = innerRingMax * innerTilt;
	}

	public static void main( String[] commands ) {
		proof( new XRingIcon() );
		//save( new XRingIcon(), new File( System.getProperty( "user.home" ), "Downloads/xenon.png" ) );
		//save( new XRingIcon(), "../../software/xenon/source/main/assembly/xenon.png");
	}

	protected void render() {
		double sqrt8 = Math.sqrt( 8 );
		double dr = getTr() + sqrt8;

		save();
		// Top ring clip
		startPath( g( dr ), g( 0 ) );
		lineTo( g( 16 ), g( 16 - dr ) );
		lineTo( g( 32 - dr ), g( 0 ) );
		closePath();
		clip();

		// Top ring
		startPath();
		addArc( g( 16 ), g( 16 ), g( outerRingMax ), g( outerRingMin ), 0, 360 );
		addArc( g( 16 ), g( 16 ), g( innerRingMax + 2 ), g( innerRingMin + 2 ), 0, 360 );
		closePath();
		fill( getPrimaryPaint() );
		restore();

		// X top (no clip needed)
		startPath();
		xTopOpen();
		addArc( g( 16 ), g( 16 ), g( innerRingMax ), g( innerRingMin ), 180, 180 );
		closePath();
		fill();

		// Main ring clip
		save();
		startPath( g( 0 ), g( 32 ) );
		lineTo( g( 0 ), g( dr ) );
		lineTo( g( 16 - innerRingMax ), g( 16 + sqrt8 ) );
		lineTo( g( 16 + innerRingMax ), g( 16 + sqrt8 ) );
		lineTo( g( 32 ), g( dr ) );
		lineTo( g( 32 ), g( 32 ) );
		closePath();
		clip();

		// Main ring
		startPath();
		addArc( g( 16 ), g( 16 ), g( outerRingMax ), g( outerRingMin ), 0, 360 );
		addArc( g( 16 ), g( 16 ), g( innerRingMax + 2 ), g( innerRingMin + 2 ), 0, 360 );
		closePath();
		fill( getPrimaryPaint() );
		reset();
		restore();

		// X bottom clip
		save();
		startPath( g( 0 ), g( 16 ) );
		addArc( g( 16 ), g( 16 ), g( outerRingMax + 2 ), g( outerRingMin + 2 ), 180, 180 );
		lineTo( g( 32 ), g( 16 ) );
		lineTo( g( 32 ), g( 32 ) );
		lineTo( g( 0 ), g( 32 ) );
		closePath();
		clip();

		// X bottom
		startPath();
		xBottomOpen();
		closePath();
		fill();
		restore();
	}

	private Paint jetPaint() {
		double jetRadius = Math.sqrt( 2 * (g( 10 ) * g( 10 )) );
		List<Stop> jetPaintStops = new ArrayList<>();
		jetPaintStops.add( new Stop( 0.1, JET_CENTER ) );
		jetPaintStops.add( new Stop( 1.0, JET_TIP ) );
		return radialPaint( g( 16 ), g( 16 ), jetRadius, jetPaintStops );
	}

	private Paint ringPaint() {
		List<Stop> ringPaintStops = new ArrayList<>();
		ringPaintStops.add( new Stop( 0.6, RING_HIGHLIGHT ) );
		ringPaintStops.add( new Stop( 0.9, RING_BASE ) );
		return radialPaint( g( 16 ), (1 / outerTilt) * g( 16 ), g( 11 ), ringPaintStops );
	}

}
