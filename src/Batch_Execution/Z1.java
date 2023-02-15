package Batch_Execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Z1 {
@Test
public void v1() {
	Reporter.log("Running v1 successfully",true);
}

@Test
public void v2() {
	Reporter.log("Running v2 successfully",true);
}

@Test
public void v3() {
	Reporter.log("Running v3 successfully",true);
}
}
