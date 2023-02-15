package With_DDF_program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws Throwable {
	FileInputStream f=new FileInputStream("C:\\Users\\yoges\\Documents\\Facebookdata.xlsx");
	Sheet sh= WorkbookFactory.create(f).getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	w.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
	String name=sh.getRow(0).getCell(0).getStringCellValue();
	w.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
	String surname=sh.getRow(0).getCell(1).getStringCellValue();
	w.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surname);
	String email=sh.getRow(0).getCell(2).getStringCellValue();
	w.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
	String Cmail=sh.getRow(0).getCell(2).getStringCellValue();
	w.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(Cmail);
	String PW=sh.getRow(0).getCell(6).getStringCellValue();
	w.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(PW);
	WebElement day=w.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s=new Select(day);
	s.selectByVisibleText("26");
	WebElement month=w.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s1=new Select(month);
	s1.selectByVisibleText("Mar");
	WebElement year=w.findElement(By.xpath("//select[@name='birthday_year']"));
	Select s2=new Select(year);
	s2.selectByVisibleText("2000");
	w.findElement(By.xpath("//label[text()='Male']")).click();
	w.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
}
}
