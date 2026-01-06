package com.acromere.zenna.icon;

import com.acromere.zerra.image.SvgIcon;

public class WrenchIcon extends SvgIcon {

	public static void main( String[] commands ) {
		proof( new WrenchIcon() );
	}

	protected void define() {
		super.define();

		//		End: 196.8744942979443
		//		Extent: 123.74898859588859
		//		Length: 12.958963782067022
		//		Origin: Point3D [x = 24.0, y = -8.0, z = 0.0]
		//		Radius: 5.999999999999999
		//		Start: 73.1255057020557

		//		End: 315.0
		//		Extent: 180.0
		//		Length: 8.885765876316732
		//		Origin: Point3D [x = 24.0, y = -8.0, z = 0.0]
		//		Radius: 2.8284271247461903
		//		Start: 135.0

		//		End: -106.8744942979443
		//		Extent: -123.74898859588859
		//		Length: 12.958963782067022
		//		Origin: Point3D [x = 24.0, y = -8.0, z = 0.0]
		//		Radius: 5.999999999999999
		//		Start: 16.87449429794429

		double r = 2.8284271247461903;

		String start = "M14,14";
		// Origin: Point3D [x = 18.25834261322606, y = -9.74165738677394, z = 0.0]
		String l1 = "L18.25834261322606,9.74165738677394";
		// Origin: Point3D [x = 25.74165738677394, y = -2.258342613226059, z = 0.0]
		String a1 = "A6,6,0,0,1,25.74165738677394,2.258342613226059";
		// Origin: Point3D [x = 22.0, y = -6.0, z = 0.0]
		String l2 = "L22,6";
		// Origin: Point3D [x = 26.0, y = -10.0, z = 0.0]
		String a2 = "A" + r + "," + r + ",0,0,0,26,10";
		// Origin: Point3D [x = 29.74165738677394, y = -6.258342613226059, z = 0.0]
		String l3 = "L29.74165738677394,6.258342613226059";
		// Origin: Point3D [x = 22.25834261322606, y = -13.74165738677394, z = 0.0]
		String a3 = "A6,6,0,0,1,22.25834261322606,13.74165738677394";
		String l4 = "L18,18";

		// Origin: Point3D [x = 13.74165738677394, y = -22.258342613226056, z = 0.0]
		String l5 = "L13.74165738677394,22.258342613226056";
		// Origin: Point3D [x = 6.258342613226058, y = -29.741657386773934, z = 0.0]
		String a5 = "A6,6,0,0,1,6.258342613226058,29.741657386773934";
		// Origin: Point3D [x = 10.000000000000007, y = -25.999999999999982, z = 0.0]
		String l6 = "L10,26";
		// Origin: Point3D [x = 5.999999999999996, y = -22.000000000000007, z = 0.0]
		String a6 = "A" + r + "," + r + ",0,0,0,6,22";
		// Origin: Point3D [x = 2.25834261322606, y = -25.74165738677394, z = 0.0]
		String l7 = "L2.25834261322606,25.74165738677394";
		// Origin: Point3D [x = 9.741657386773946, y = -18.258342613226056, z = 0.0]
		String a7 = "A6,6,0,0,1,9.741657386773946,18.258342613226056";

		fill( start + l1 + a1 + l2 + a2 + l3 + a3 + l4 + l5 + a5 + l6 + a6 + l7 + a7 + "Z" );
	}

}
