package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
public static void main(String[] args) throws Throwable{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
     ChromeOptions c=new ChromeOptions();
     c.addArguments("--disable-notifications");
     c.addArguments("start-maximized");
	Thread.sleep(4000);
	WebDriver w=new ChromeDriver(c);
	w.get("https://www.axisbank.com/");
	w.findElement(By.xpath("//span[text()='X']")).click();

	

	
	
	
}
}
