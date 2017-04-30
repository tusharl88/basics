package third;

public class incrementanddecrement {
	 public static void main(String[] args) 
		{
		int a=10,b=20;
		System.out.println(++a);  //10 to 11
		System.out.println(--a);  //11 to 10
		System.out.println(a++);  //10 is printed but 'a' becomes 11.
		System.out.println(a);
		System.out.println(a--);  //11 is printed but 'a' becomes 10.
		System.out.println(a);
		
		a = a + 5;
		a+=5;                //both are same
		System.out.println(a);
		
		a-=6;
		System.out.println(a);
		
		a*=2;
		System.out.println(a);
		}
	}


