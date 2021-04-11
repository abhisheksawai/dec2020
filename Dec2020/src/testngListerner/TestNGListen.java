package testngListerner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testngListerner.ListenerDemo.class)
public class TestNGListen {
	
	@Test
	public void tc_01_VerifyHomePage()
	{
		System.out.println("tc o1");
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
