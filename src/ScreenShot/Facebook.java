package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Facebook {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\yoges\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	Thread.sleep(4000);
	TakesScreenshot t=(TakesScreenshot)w;
File Sc=	t.getScreenshotAs(OutputType.FILE);
File Dest=new File("C:\\Users\\yoges\\Desktop\\Selenium Screenshot\\facebook.jpg");
Files.copy(Sc, Dest);
WebElement logo=w.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
File n = logo.getScreenshotAs(OutputType.FILE);
File loc=new File("C:\\\\Users\\\\yoges\\\\Desktop\\\\Selenium Screenshot\\\\facebookLogo.jpg");
Files.copy(n, loc);


}
}
