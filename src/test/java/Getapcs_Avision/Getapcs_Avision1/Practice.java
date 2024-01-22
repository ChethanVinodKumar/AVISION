package Getapcs_Avision.Getapcs_Avision1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Getapcs.Avision.BASECLASS.TestBase;



public class Practice {

public static void main(String[] args) throws InterruptedException, Exception {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://bard.google.com/chat/9fa9c64aa4e52bc9?hl=en");
	
	
	 String fileName = "whatsApp";
	 String filePath = ".//Getapcs_Avision//ScreenShot//" + fileName + ".png";

	    // Check if the previous screenshot file exists
	    File previousScreenshot = new File(filePath);
	    if (previousScreenshot.exists()) {
	        // Delete the previous screenshot file
	        FileUtils.forceDelete(previousScreenshot);
	    }
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(filePath));
}
}
