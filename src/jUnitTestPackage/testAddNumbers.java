package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	
	 public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		Number result = junit.addNumbers(2, 9);
		assertEquals(11,result);
	   }
}
