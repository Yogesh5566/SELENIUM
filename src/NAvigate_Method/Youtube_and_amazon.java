package NAvigate_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_and_amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.youtube.com/");
	Thread.sleep(2000);
	w.get("https://www.amazon.com/");
	Thread.sleep(2000);
	w.navigate().back();
	Thread.sleep(2000);
	w.navigate().forward();
	Thread.sleep(3000);
	w.close();
}
}
