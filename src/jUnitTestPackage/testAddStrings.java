package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
	//	fail("Not yet implemented");
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.addstrings("Avni", "Gupta");
		assertEquals("AvniGupta",result);
	}
}