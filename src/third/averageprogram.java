package third;

import java.util.Scanner;

public class averageprogram { // master has failed more then the beginner has ever tried.

	public static void main(String[] args)
	{
	
	Scanner tushar= new Scanner(System.in);
	double number, total=0,counter=0,average=0;
	while(counter<10)
	{
	number = tushar.nextDouble();
	total= total + number;        //usedirectly total= total + tushar.nextDouble();
	counter++;
	
	}
	average = total/counter;
	System.out.println(average);
	}
}




