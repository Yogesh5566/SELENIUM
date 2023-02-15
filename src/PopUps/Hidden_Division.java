package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://chercher.tech/java/pop-ups-selenium-webdriver");
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	w.findElement(By.xpath("//a[@class='closesubscribe']")).click();
}
}
