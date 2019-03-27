package com.dbs.training.demoproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGreet {

	@Test
	public void test() {
		App app = new App();
		String msg = app.greet();
		assertEquals("Hello", msg);
	}

}
