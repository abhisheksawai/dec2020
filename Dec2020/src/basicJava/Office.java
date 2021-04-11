package basicJava;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Office {

		
		@BeforeSuite
		public void b() {}
		
		@AfterMethod
		public void c() {}
		
		@BeforeClass
		public void d() {}
		
		@AfterClass
		public void a2() {}
		
		@Test
		public void a1() {}
		
		@Test
		public void f() {}
		
		
	}

