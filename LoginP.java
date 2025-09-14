package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_components.BaseClass;

public class LoginP extends BaseClass {

	    WebDriver driver;
	    
	    public void LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	   // @FindBy(id = "user-name")
		//WebElement userName;
	    
	    private By userName = By.id("user-name");
	    private By passwordF = By.id("password");
	    private By loginButton = By.id("login-button");

	  

	    public void login(String username, String password) throws InterruptedException {
	        Thread.sleep(5000);
	    	driver.findElement((By) userName).sendKeys(username);
	    	 Thread.sleep(5000);
	        driver.findElement(passwordF).sendKeys(password);
	        driver.findElement(loginButton).click();
	    }
	}
	
	
	
	

