package testNGAttributes;

import org.testng.annotations.Test;

public class TestNGAttribute3 {
	
	@Test(timeOut=200)
	public void verifyHomePage()
	{
		System.out.println("verifyHomePage");
	}
	@Test
	public void verifyActionsHomepage()
	{
		System.out.println("verifyActionsHomepage");
	}
	@Test
	public void verifyLogin()
	{
		System.out.println("verifyLogin");
	}

}
