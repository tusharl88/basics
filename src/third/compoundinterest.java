package third;

public class compoundinterest {
	public static void main(String[] args)
	{
		double principal,amount=5000, rate=0.05;
		for(int year=1;year<11;year++)
		{
			principal=amount*Math.pow(1+rate,year);  // formula for compound interest is P=A(1+Rate/n)^nt;
			System.out.println(principal);		
		}
	}
}
