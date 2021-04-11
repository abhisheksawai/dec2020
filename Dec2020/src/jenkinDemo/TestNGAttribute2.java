package jenkinDemo;

import org.testng.annotations.Test;

public class TestNGAttribute2 {
	
	@Test(description="Verify facebook homepage getting displayed")
	public void tc_01_VerifyHomePage()
	{
		System.out.println("from jenkins tc o1");
	}
	
	@Test
	public void tc01_checktitle()
	{
		System.out.println("from jenkins check title tc o2");
	}

}
