package com.test;

import org.apache.poi.ss.formula.eval.NotImplementedException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClassOne {
	//Hi this is my first comment....
	//it will show when i will comiit it.
	@Test
	public void testMethodPass()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void testMethodFail()
	{
		throw new NotImplementedException("failed intentially");
	}
	@Test
	public void testMethodSkip()
	{
		throw new SkipException("Skkipping intentionally"); 
	}

}
