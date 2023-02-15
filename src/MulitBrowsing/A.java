package MulitBrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	WebDriver w=null;
	@Parameters("browsername")
@Test
public void m1(String browsername) {
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoges\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		w=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\yoges\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			w=new FirefoxDriver();
		}
		else if(browsername.equals("edge")){
			System.setProperty("webdriver.edge.driver", "C:\\Users\\yoges\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			w=new EdgeDriver();
		}
		w.get("https://web.whatsapp.com/");
	}
	
}
