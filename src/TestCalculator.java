

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestCalculator 
{
	private Calculator calculator;
	
	@Before
	public void init()
	{
		calculator = new Calculator();
	}

	@Test
	public void  emptyString() throws Exception
	{
		Assert.assertEquals(calculator.add(""), 0);
	}
	
	@Test
	public void singleValueSum() throws Exception
	{
		Assert.assertEquals(calculator.add("1"), 1);
	}

	@Test
	public void twoValueCommonDelimiterSum() throws Exception
	{
		Assert.assertEquals(calculator.add("1,2"), 3);
	}
	
	@Test
	public void moreValueCommonDelimiterSum() throws Exception
	{
		Assert.assertEquals(calculator.add("1,2,3,4"), 10);
	}
	
	@Test
	public void ValueAlphabetsSum() throws Exception
	{
		Assert.assertEquals(calculator.add("1,2,z,c"), 32);
	}
	
	@Test(expected=Exception.class)
	public void hasNegativeInput() throws Exception
	{
		calculator.add("-1");
	}
	
	@Test
	public void valueOverflow() throws Exception
	{
		Assert.assertEquals(calculator.add("1,2,3,4,1001"), 10);
	}
}
