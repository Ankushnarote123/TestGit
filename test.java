package TestAnku;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_components.BaseClass;
import Pom.HomeP;
import Pom.LoginP;
import utils.ConfigReader;

//@Listeners(TestListener.class)   
public class test extends BaseClass
{
	

	    @Test
	    public void loginAndAddItemsTest() throws InterruptedException {

	        LoginP loginP = new LoginP();
	        HomeP homeP = new HomeP(driver);
	        

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        // Fetch credentials from config
	        String username = ConfigReader.getProperty("username");
	        String password = ConfigReader.getProperty("password");
	        
	        loginP.login(username, password);

	        
	        
	        
	   	 // Fetch items dynamically from config
	        String[] items = ConfigReader.getProperty("items").split(",");
	        for (int i = 0; i < 2; i++) {
	            homeP.addToCart(items[i].trim());
	        }
	   
	    	
	    	
	    
	    }
	}

	


