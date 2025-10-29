class Perfectnumber1
{
     public static void main (string args[])
	 {
	     int limit=10000;
		 System.out.println("perfect number up to" "+limit+"are:");
		 for(int num=i;num<=limit;num++)
		 {
		    int sum=0;
			for(int i=1;i<=num/2;i++){
			    if(num%i==0)
				{
				   sum+=i;
				}
			}
			if (sum==num)
			{
			    System.out.println(num);
			}
		}
	}
}