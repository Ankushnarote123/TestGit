package Pom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Base_components.BaseClass;



public class HomeP extends BaseClass {

	    
	    private WebDriver driver;

		public HomeP(WebDriver driver) 
		{
			//super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		
	   public void addToCart(String itemName) 
	   {
	        String xpath = "//div[text()='" + itemName + "']/ancestor::div[@class='inventory_item']//button";
	        driver.findElement(By.xpath(xpath)).click();
	    }
	}
	
	
	
