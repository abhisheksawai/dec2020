package jenkinDemo;

import org.testng.annotations.Test;

public class TestNGAttribute3 {
	
	@Test(description="Verify tc_01_VerifyDashboardPage homepage getting displayed")
	public void tc_01_VerifyDashboardPage()
	{
		System.out.println("from jenkins tc o3");
	}
	
	@Test
	public void tc01_checktitle()
	{
		System.out.println("from jenkin check title tc o4");
	}

}
