package com.mycompany.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;




public class HomePageMenusTest extends TestBaseER{
	

	 @Test(priority=1)
	  public void validateAboutButton(){//method ismi istedigimiz bir isim 
		    extentTest = extent.startTest("About button validation ");	//test result screenshot almasi icin
			homePage.validateHomeButton(); //homePage de bu metoda git ve sonucu flag degiskenine al
			//Assert.assertTrue(flag);  //aldigin sonuc dogruysa test gecti anlamina geliyor.
			System.out.println(homePage.getTitle());//gittigimiz sayfanin title ini almak icin
	  }

	
	 
	 
	 
  }
 
 
  

