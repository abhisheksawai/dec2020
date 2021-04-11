package testNGAttributes;

import org.testng.annotations.Test;

public class TestNGAttribute5 {
	
	@Test(priority=0)
	public void verifyHomePage()
	{
		System.out.println("verifyHomePage2");
	}
	@Test
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
