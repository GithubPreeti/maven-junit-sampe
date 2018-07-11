package maven.junit.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Demo demo = new Demo();
		int result = demo.Addition(12, 2);
		assertEquals(14, result);
	}

}
