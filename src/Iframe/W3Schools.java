package Iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.w3schools.com/html/html_iframe.asp");
	w.switchTo().frame("__tcfapiLocator");
	String title= w.getTitle();
	System.out.println(title);
	w.switchTo().defaultContent();
	w.switchTo().frame("__uspapiLocator");
	String title2=w.getTitle();
	System.out.println(title2);
}
}
