
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
				int temp = (int)c;
			    int temp_integer = 96; //for lower case
			    if(temp<=122 & temp>=97)
			    {
			        int add=temp-temp_integer;
			        sum+=add;
			    }
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

}
