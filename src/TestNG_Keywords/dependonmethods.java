package TestNG_Keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependonmethods {
@Test
public void login() {
	Reporter.log("Login is completed",true);
	Assert.fail();
}

@Test(dependsOnMethods= {"login"})
public void logout() {
	Reporter.log("Logout is completed",true);
}
}
