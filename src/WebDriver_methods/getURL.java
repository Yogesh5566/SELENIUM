package WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getURL {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
		String url=w.getCurrentUrl();
		System.out.println(url);
}
}