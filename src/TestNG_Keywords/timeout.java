package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
@Test
public void T1() {
	Reporter.log("Running T1",true);
}

@Test(timeOut = 10000)
public void T2() {
	Reporter.log("Running T2",true);
}
}
