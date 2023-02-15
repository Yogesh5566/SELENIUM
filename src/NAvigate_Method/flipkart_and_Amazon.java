package NAvigate_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_and_Amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\yoges\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	d.get("https://www.amazon.com/");
	Thread.sleep(2000);
	d.navigate().back();
	Thread.sleep(3000);
	d.navigate().forward();
	Thread.sleep(5000);
	d.navigate().refresh();
	d.close();
}
}
