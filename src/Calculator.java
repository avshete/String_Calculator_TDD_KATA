
public class Calculator 
{
	public int add(String input)
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
	
	private int getSum(String[] value)
	{
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
				sum += Integer.parseInt(i);
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

}
