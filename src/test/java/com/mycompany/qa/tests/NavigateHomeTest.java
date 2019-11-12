package com.mycompany.qa.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mycompany.qa.pages.PageFactoryBase;


public class NavigateHomeTest extends TestBaseER{
	
		
	
 
 
 @Test 
 public void navigateHome() throws InterruptedException{
	  extentTest = extent.startTest("MyAccount button validation");	
	  homePage.clickFlight().oneWayFlight().originCity().destinationCity().infoFlight().childrenButton().searchButton();
	
 }
  
}
