package TestGITFirst.TestGITFirst;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {

	@Test

	public void test() {

		System.out.println("Test 1");

		for (int i = 0; i < 10; i++) {
			System.out.println("i>>>>>>>>> " + i);

			Assert.assertEquals(true, true);
		}
	}
}
