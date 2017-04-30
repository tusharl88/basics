package third;

import java.util.Scanner;
public class calculator
	{
		public static void main(String[] args)
		{
		Scanner tushar = new Scanner(System.in);
		double fnum,snum,answer;
		System.out.println("enter first number");
		fnum= tushar.nextDouble();
		
		System.out.println("enter second number");
		snum = tushar.nextDouble();
		
	    answer = fnum + snum ;
		System.out.println(answer);
		
		
	}
	}
		
