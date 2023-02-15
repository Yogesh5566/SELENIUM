package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
@BeforeClass
public void T1() {
	Reporter.log("T1 running successfully",true);
}
@BeforeMethod
public void T2() {
	Reporter.log("T2 running successfully",true);
}
@Test
public void T3() {
	Reporter.log("T3 running successfully",true);
}
@AfterMethod
public void T4() {
	Reporter.log("T4 running successfully",true);
}
@AfterClass
public void T5() {
	Reporter.log("T5 running successfully",true);
}
}
