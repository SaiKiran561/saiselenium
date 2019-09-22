package com.nbrown.dataprovider;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener.class)

public class B {
@Test
public void m1() {
	System.out.println("m1-A");
	Assert.assertTrue(true);
}
@Test
public void m2() {
	System.out.println("M2-A");
	Assert.assertTrue(false);
}
}
