package com.mycompany.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mycompany.qa.util.JSEHelper;

public class PageFactoryBase {
	
	//private WebDriver driver;
	protected WebDriver driver;
	JSEHelper js = new JSEHelper();
	
	public PageFactoryBase(WebDriver driver) 
    {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	
	
	//PAGE FACTORY
	   		
		//Home Button
		@FindBy(xpath="//a[@id='primary-header-home']")  //a[contains(text(),'My account')]
		WebElement homeButton;
		
		//Flight Button
		@FindBy(xpath="//button[@id='tab-flight-tab-hp']") 
		WebElement flightButton;
		
		//One Way Button    
		@FindBy(xpath="//*[@id=\"flight-type-one-way-label-hp-flight\"]") 
		WebElement oneWayButton;
	
		//Flight from   
		@FindBy(xpath="//*[@id='flight-origin-hp-flight']") 
		WebElement flyingFrom;
		
		@FindBy(xpath="//*[@id='typeaheadDataPlain']/div/li")
		List<WebElement> originList;
		
		//Flight To        
		@FindBy(xpath="//*[@id='flight-destination-hp-flight']") 
		WebElement flyingTo;
		
		@FindBy(xpath="//*[@id='typeaheadDataPlain']/div/li")
		List<WebElement> destinationList;
		
		//depart date  
		@FindBy(xpath="//input[@id='flight-departing-single-hp-flight']") 
		WebElement departDate;
		
		//Adult  
		@FindBy(xpath="//select[@id='flight-adults-hp-flight']") 
		WebElement adult;
		
		//child
		@FindBy(xpath="//*[@id=\"flight-children-hp-flight\"]") 
		WebElement children;
				
		//child 1
		@FindBy(xpath="//*[@id=\"flight-age-select-1-hp-flight\"]") 
		WebElement child1;
				
		//child 2 
		@FindBy(xpath="//*[@id=\"flight-age-select-2-hp-flight\"]") 
		WebElement child2;
				
		//child 3 
		@FindBy(xpath="//*[@id=\"flight-age-select-3-hp-flight\"]") 
		WebElement child3;
			
		//child 4 
		@FindBy(xpath="//*[@id=\"flight-age-select-4-hp-flight\"]") 
		WebElement child4;
			
		//child 5 
		@FindBy(xpath="//*[@id=\"flight-age-select-5-hp-flight\"]") 
		WebElement child5;
				
		//child 6 
		@FindBy(xpath="//*[@id=\"flight-age-select-6-hp-flight\"]") 
		WebElement child6;
				
				
		
		
		//Search   //a[contains(text(),'My account')]
		@FindBy(xpath="//*[@id='gcw-flights-form-hp-flight']/div[9]/label/button") 
		WebElement search;
		
		
		//My Account Menu
		@FindBy(xpath="//a[@title='My account']")  //a[contains(text(),'My account')]
		WebElement myAccountButton;
		
		
		
		
		
	
		
		
	
	
}
