package com.listerners.udemy;

import org.testng.Assert;
import org.testng.SkipException;

import org.testng.annotations.Test;

// @Listeners(com.listerners.udemy.CustomListeners.class)
public class ListenersExample {
	@Test
	public void test1() {
		System.out.println("The Listeners of Test1 method");
		Assert.assertEquals("A", "A");
	}

	@Test
	public void test2() {
		System.out.println("The Listeners of Test2 method");
		Assert.assertEquals("A", "B");
	}

	@Test
	public void test3() {
		System.out.println("The Listeners of Test3 method");
		throw new SkipException("The method is skipped");
	}

}
