package third;

public class Finalmother {
	public static void main(String [] args)
	{
		finaldaughter d= new finaldaughter(10);
		for(int i=0; i<5; i++)
		{
			d.add();
			System.out.println(d.toString());
		}
	}

}
