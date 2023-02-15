package NAvigate_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_and_facebook {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	d.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	d.navigate().back();
	Thread.sleep(2000);
	d.navigate().forward();
	Thread.sleep(3000);
	d.close();
}
}
