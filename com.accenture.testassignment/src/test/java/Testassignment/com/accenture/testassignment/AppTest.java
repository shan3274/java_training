package Testassignment.com.accenture.testassignment;

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class AppTest {
	
	@Test
	public void addTest() {
		App app = new App();
		assertEquals(20, app.add(10, 10));
	}
	@Test
	public void subTest() {
		App app = new App();
		assertEquals(20, app.sub(30, 10));
	}
}
