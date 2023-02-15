package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\yoges\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	w.manage().window().maximize();
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	w.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	w.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yogesh");
	w.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dhumal");
	w.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("yogesh.dhumal@walchandsangli.ac.in");
	w.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("yogesh.dhumal@walchandsangli.ac.in");
	w.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Yograj@123");
	
	WebElement day=w.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s=new Select(day);
	s.selectByVisibleText("26");
	WebElement month=w.findElement(By.xpath("//select[@id='month']"));
	Select s2 =new Select(month);
	s2.selectByVisibleText("Mar");
	WebElement Year=w.findElement(By.xpath("//select[@title='Year']"));
	Select s3 =new Select(Year);
	s3.selectByVisibleText("2000");
	w.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	w.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
}
}
