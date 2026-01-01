package com.acromere.zenna.icon;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;

import static org.assertj.core.api.Assertions.assertThat;

public class WrenchIconTest {

	@Test
	void testToSvg() throws Exception {
		WrenchIcon icon = new WrenchIcon();
		icon.define();
		assertThat( icon.toSvg() ).isNotNull();

		File file = new File( "target/wrench.svg" );
		try( FileWriter writer = new FileWriter( file ) ) {
			writer.write( icon.toSvg() );
		}
	}
}
