package listenersITTestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;

public class TestNGListener3 {

	@Test
	public void login() {
		System.out.println("Test1");
		Assert.assertEquals(true, true);

	}

	@Test
	public void registration() {
		System.out.println("Test2");
		Assert.assertTrue(false, "Failing");
	
	}

	@Test
	public void report() {
		System.out.println("Test3");
		throw new SkipException("Test is skipped");

	}

}
