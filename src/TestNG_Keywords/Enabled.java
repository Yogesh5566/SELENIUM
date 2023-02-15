package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
@Test(enabled=false)
public void T1() {
	Reporter.log("running T1",true);
}
@Test
public void T2() {
	Reporter.log("running T2",true);
}
}
