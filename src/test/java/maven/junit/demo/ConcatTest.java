package maven.junit.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void test() {
		Demo demo = new Demo();
		String result = demo.Concat("Hi", "DemoClass");
		assertEquals("HiDemoClass", result);

	}

}
