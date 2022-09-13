package com.hyr.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Part_05 {
  @Test
  public void m1 ()
  {

	  System.out.println("a");
      Assert.fail();
//	  SoftAssert  sa=new SoftAssert();
//	  sa.fail();
	  System.out.println("b");
	  System.out.println("c");
	  System.out.println("d");
	 // sa.assertAll();
	  
	  
  }
  @Test
  public void m2() 
  {
	  System.out.println("a");
	//  Assert.fail();
	  System.out.println("b");
	  System.out.println("c");
	  System.out.println("d");
  }
  }

