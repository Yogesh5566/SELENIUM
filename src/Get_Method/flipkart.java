package Get_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	d.close();
}
}
