package com.hyr.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Part_06 {
	@Test
	public void checkaAssertion()
	{
		String actual ="Moto";
		String expected="moto";
		Assert.assertEquals(actual, expected);
		System.out.println("Its Raining");
	}
	@Test
	public void checkingAssertion()
	{
		String actual ="Darling";
		String expected="ling";
		Assert.assertTrue(actual.contains(expected));
		System.out.println("Rebel");
	}
	
 @Test
	public void checkAssertion()
	{
		String actual="Mahabharath";
		String expected="mahabharath";
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(actual.contains(expected));
		//sf.assertEquals(actual, expected);
		System.out.println("Future Execution123");
		sf.assertAll();
		}
}
