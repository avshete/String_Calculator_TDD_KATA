
public class Calculator 
{
	public int add(String input)
	{
		if(isEmpty(input))
		{
			return 0;
		}
		else
		{
			return stringToInt(input);
		}
		
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
