package third;

public class finaldaughter {
	private int sum;
	private final int number;
	
	public finaldaughter (int x)
	{
		number=x;
		
	}
	public void add()
	{
		sum+=number;
	}
	public String toString()
	{
		return String.format("sum=%d", sum);
	}

}
