class Methodoverloading
{
    int add(int a,int b)
	{
	    return a+b;
	}
	int add(int a,int b,int c)
	{
	    return a+b+c;
	}
	    double add(double a,double b)
		{
		    return a+b;
		}
		public static void main(string args[])
		{
		    Methodoverloadingobj= new 
		Methodoverloading();
		    System.out.println("Sum of 2 integers:"+obj.add(10,20));
			System.out.println("Sum of 3 integers:"+obj.add(5,10,15));
			System.out.println("Sum of 2 doubles:"+obj.add(3.5,4.5));
		}
	}
			
		