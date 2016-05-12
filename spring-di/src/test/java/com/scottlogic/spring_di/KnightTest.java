package com.scottlogic.spring_di;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = KnightConfiguration.class)
public class KnightTest {

	@Autowired
	private Knight knight;

	@Test
	public void testFight() {

		Assert.assertNotNull(knight);
		knight.fight();
	}
}
