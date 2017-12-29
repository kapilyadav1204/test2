package TestGITFirst.TestGITFirst;

import org.testng.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@org.testng.annotations.Test

	public void testinsideapp() {

		System.out.println("Test 1");

		for (int i = 0; i < 10; i++) {
			System.out.println("i>>>>>>>>> " + i);

			Assert.assertEquals(true, true);
		}
	}
}
