
public class Calculator 
{
	public int add(String input) throws Exception
	{
		String[] value = input.split(",");
		
		if(isEmpty(input))
		{
			return 0;
		}
		if(input.length()==1)
		{
			return stringToInt(input);
		}
		else
		{
			return getSum(value);
		}
		
	}
	
	private int getSum(String[] value) throws Exception 
	{
		hasNegativeValue(value);
		
		int sum=0;
		for(String i:value)
		{
			String str = i;
			char c=str.charAt(0);
			if(!Character.isDigit(c))
			{
				int add=valueOf(c);

			    sum+=add;
			}
			else
			{
				if(Integer.parseInt(i)<=1000)
				{
					sum += Integer.parseInt(i);
				}
			}
		}
		return sum;
	}
	
	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
	
	private int stringToInt(String input)
	{
		return Integer.parseInt(input);
	}
	
	private int valueOf(char c)
	{
		int temp = (int)c;
	    int temp_integer = 96; //for lower case
	    return temp-temp_integer;
	    	
	}
	
    private void hasNegativeValue(String[] value) throws Exception
	{

		for(String i:value)
		{
			String str = i;
			char c=str.charAt(0);
			if(Character.isDigit(c) && stringToInt(i)<0)
			{
				throw new Exception("Negative Integer");
			}
		
		}
	}

}
