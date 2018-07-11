package maven.junit.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Demo demo = new Demo();
		int result=demo.Add(3, 3);
		assertEquals(6, result);
	}

}
