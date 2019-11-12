package com.mycompany.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NavigateHomePage extends PageFactoryBase {

	
	public NavigateHomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	
	
	
	public NavigateHomePage oneWayFlight() throws InterruptedException {
				
		oneWayButton.click();
		
		return new NavigateHomePage(driver);
	}	
		
	public NavigateHomePage originCity() throws InterruptedException {
		String originCity="New Orleans, LA, United States";
		flyingFrom.click();
		Thread.sleep(2000);
		flyingFrom.sendKeys(originCity.substring(0, 3));
    
		System.out.println("origin size : "+ originList.size());
		
		for(int i=0; i<originList.size(); i++)
    {
      if(originList.get(i).getText().contains(originCity))
         {
    	  originList.get(i).click();
            break;
         } } 
    return new NavigateHomePage(driver);
	}		
    
    //=============
    
	public NavigateHomePage destinationCity() throws InterruptedException {
	
	String destinationCity="Baltimore Washington Intls";
	flyingTo.click();
	Thread.sleep(2000);
	flyingTo.sendKeys(destinationCity.substring(0, 5));
	
	System.out.println("destination size : "+ destinationList.size());
	
     for(int y=0; y<destinationList.size(); y++)
  {	
     if(destinationList.get(y).getText().contains(destinationCity))
	  System.out.println(destinationList.get(y).getText());
     {
    	destinationList.get(y).click();
        break;
     } } 
    return new NavigateHomePage(driver);
	}	
	
	public NavigateHomePage infoFlight() throws InterruptedException {	
		departDate.sendKeys("04/10/2019");
		 adult.click();
		Select adultNo= new Select(adult);
		adultNo.selectByVisibleText("2");
		System.out.println("=============================");
        System.out.println("Selected Adult Number : "+ adultNo.getFirstSelectedOption().getText());
		
        return new NavigateHomePage(driver);
	}
        
        public NavigateHomePage childrenButton() throws InterruptedException {	
        
        
        children.click();
		Select childNo= new Select(children);
		childNo.selectByVisibleText("2");
		
		if(childNo.getFirstSelectedOption().getText().equals("1")) {
			child1.click();
			Thread.sleep(2000);
			Select child1Age= new Select(child1);
			child1Age.selectByVisibleText("3");
			}
		
		if(childNo.getFirstSelectedOption().getText().equals("2")) {
			child1.click();
			Thread.sleep(2000);
			Select child1Age= new Select(child1);
			child1Age.selectByVisibleText("7");
			child1Age.getFirstSelectedOption().getText();
			System.out.println("First Child Age : "+child1Age.getFirstSelectedOption().getText());
			
			child2.click();
			Thread.sleep(2000);
			Select child2Age= new Select(child2);
			child2Age.selectByVisibleText("12");
			child2Age.getFirstSelectedOption().getText();
			System.out.println("Second Child Age : "+child2Age.getFirstSelectedOption().getText());
			}
        
        Thread.sleep(3000);
        return new NavigateHomePage(driver);
        }
		
        public NavigateHomePage searchButton() { 
        
        search.click();
     	js.scrollPageDown(driver); // Bunu Java Script executer ile yapiyoruz!
      	
    	return new NavigateHomePage(driver);
    		
    	}	
        
     	}
