package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Classtwo {
	
	String nameOne = "abhishek";
	String nameTwo = "sanu";
	String nameThree = "abhishek";
	SoftAssert softAssertion1= new SoftAssert();
//	public void softAssertOne(){
//		SoftAssert softAssertion= new SoftAssert();
//		System.out.println("softAssertOne Method Was Started");
//		softAssertion.assertTrue(false);
//		System.out.println("softAssertOne Method Was Executed");
//	}
	
	public void softAssertTwo(){
		//SoftAssert softAssertion1= new SoftAssert();
		System.out.println("softAssertTwo Method Was Started");
		softAssertion1.assertEquals(nameOne, nameTwo);
		System.out.println("nantr softAssertTwo Method Was Executed");
		softAssertion1.assertEquals(nameOne, nameThree);
		
		//softAssertion1.assertAll();
	}
	public void softAssertThree(){
		//SoftAssert softAssertion= new SoftAssert();
		System.out.println("3 softAssertThree Method Was Started");
		softAssertion1.assertEquals(nameOne, nameThree,"xyz");
		//softAssertion.assertTrue(false);
		System.out.println("nntr 3 softAssertThree Method Was Executed");
		//softAssertion1.assertAll();
	}
	public void assertalldo()
	{
		softAssertion1.assertAll();
	}

}
