package ROBOT_Class;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Down {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.flipkart.com/");
	w.manage().window().maximize();
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	w.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	w.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Asus ROG laptop",Keys.ENTER);
	Thread.sleep(4000);
	JavascriptExecutor j=(JavascriptExecutor)w;
	j.executeScript("window.scrollBy(0,2000)");
	w.findElement(By.xpath("(//div[text()='ASUS ROG Strix G15 (2022) with 90Whr Battery Ryzen 9 Octa Core 6900HX - (16 GB/1 TB SSD/Windows 11 Hom...'])[2]")).click();
	Thread.sleep(4000);
	Set<String> a=w.getWindowHandles();
	Iterator it=a.iterator();
	String parentId=(String)it.next();
	String childId=(String)it.next();
	w.switchTo().window(childId);
	w.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("425001");

	w.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
}
}
