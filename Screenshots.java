package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots 
{
	
	    public static String capture(WebDriver driver, String testName)
	    {
	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        String path = "screenshots/" + testName + "_" + timestamp + ".png";
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try 
	        {
	            FileUtils.copyFile(src, new File("user.dir"+"\\screenshot.png"));
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	        return path;
	    

}
}
