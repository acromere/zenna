package com.acromere.zenna.icon;

/**
 * Use <a href="http://www.pic2icon.com/">Pic2Icon</a> to convert to Windows icon.
 */
public class XRingLargeIcon extends XRingIcon {

	public XRingLargeIcon() {
		super( 4, 6 );
	}

	public static void main( String[] commands ) {
		proof( new XRingLargeIcon() );
		//save( new XRingLargeIcon(), new File( System.getProperty( "user.home" ), "Downloads/xenon.png" ) );
		//save( new XRingLargeIcon(), "../../software/xenon/source/main/assembly/xenon.png");
		//save( new XRingLargeIcon(), "../../software/xenon/source/main/resources/program.png");
	}

}
