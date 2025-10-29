class vehicle 
{
    void run()
	{
	    System.out.println("vehicle is running");
	}
	class bike extends vehicle
	{
	    void run()
		{
		    System.out.println("bike is running");
		}
		class car extends vehicle
		{
		    void run()
			{
			    System.out.println("car is running");
			}
		}
		public class testPolymorphism
		{
		    public static void main (String args[])
			{
			    vehicle v;
				v=New car();
				v.run();
				v=New bike();
				v.run();
			}
		}
	}
}
	
			
		
	
				