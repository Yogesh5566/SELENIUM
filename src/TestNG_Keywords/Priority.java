package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority=3)
public void z1() {
	Reporter.log("Running z1",true);
}
@Test(priority=2)
public void z2() {
	Reporter.log("Running z2",true);
}
@Test(priority=1)
public void z3() {
	Reporter.log("Running z3",true);
}
@Test(priority=0)
public void z4() {
	Reporter.log("Running z4",true);
}
@Test(priority=-1)
public void z5() {
	Reporter.log("Running z5",true);
}
}
