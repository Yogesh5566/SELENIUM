package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	w.findElement(By.xpath("//body[@contenteditable='false']/descendant::button")).click();
	/*w.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	Alert a=w.switchTo().alert();
	a.accept();*/
}
}