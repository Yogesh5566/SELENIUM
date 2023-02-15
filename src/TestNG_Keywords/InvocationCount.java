package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
@Test(invocationCount = 15)
public void T1() {
	Reporter.log("running T1",true);
}
}
