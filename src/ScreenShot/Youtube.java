package ScreenShot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Youtube {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\yoges\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.youtube.com/");
	Thread.sleep(5000);
	TakesScreenshot t=(TakesScreenshot)w;
	File s=t.getScreenshotAs(OutputType.FILE); 
	File n=new File("C:\\\\Users\\\\yoges\\\\Desktop\\\\Selenium Screenshot\\\\Youtube.jpg");
	Files.copy(s, n);
	WebElement mm=w.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
	File Icon=mm.getScreenshotAs(OutputType.FILE);
	File f=new File("C:\\\\\\\\Users\\\\\\\\yoges\\\\\\\\Desktop\\\\\\\\Selenium Screenshot\\\\\\\\YoutubeLogo.jpg");
	Files.copy(Icon, f);
}
}
