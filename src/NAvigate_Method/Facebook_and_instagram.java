package NAvigate_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_and_instagram {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.navigate().to("https://www.facebook.com/");
	Thread.sleep(5000);
	d.navigate().to("https://www.instagram.com/");
	Thread.sleep(5000);
	d.navigate().back();
	Thread.sleep(5000);
	d.navigate().forward();
	Thread.sleep(5000);
	d.close();
	
}
}
