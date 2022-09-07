import static org.junit.Assert.*;

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
	public void  emptyString()
	{
		Assert.assertEquals(calculator.add(""), 0);
	}
	
	@Test
	public void singleValueSum()
	{
		Assert.assertEquals(calculator.add("1"), 1);
	}

	@Test
	public void twoValueCommonDelimiterSum()
	{
		Assert.assertEquals(calculator.add("1,2"), 3);
	}
	
	@Test
	public void moreValueCommonDelimiterSum()
	{
		Assert.assertEquals(calculator.add("1,2,3,4"), 10);
	}
	
	@Test
	public void ValueAlphabetsSum()
	{
		Assert.assertEquals(calculator.add("1,2,a,c"), 7);
	}
}
