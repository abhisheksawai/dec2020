package testNGAttributes;

import org.testng.annotations.Test;

public class TestNGAttribute4 {
	
	@Test(priority=2)
	public void verifyHomePage()
	{
		System.out.println("verifyHomePage2");
	}
	@Test(priority=3)
	public void verifyActionsHomepage()
	{
		System.out.println("verifyActionsHomepage3");
	}
	@Test(priority=1)
	public void verifyLogin()
	{
		System.out.println("verifyLogin1");
	}

}
