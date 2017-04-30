package third;

public class chintu {
	public static void main(String[] args)
	{
		int altu[]={45, 20, 300, 4, };
		int baltu[]={50, 41, 600, 12};
		int saltu[]={30, 41, 600, 12};
		
		System.out.println(allLess(altu,saltu));
	
	}

	public static boolean allLess(int[] a, int[] b) {
	    if (a.length == b.length)
	    {
	        for (int i = 0; i < a.length; i++)
	        {
	            if (a[i] >= b[i])
	            {
	                return false;
	            }
	        }
	    } 
	    else {
	        return false;
	    }
	    return true;
	
}
}
