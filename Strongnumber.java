class Strongnumber
{
    public static void main(String args[])
	{
	    int num=145;
		int temp=num;
		int sum=0;
		while(temp>0)
		{
		    int digit=temp%10;
			int fact=1;
			for(int i=1;i<=digit;i++)
			{
			    fact*=i;
			}
			sum+=fact;
			temp/=10;
		}
		if(sum==num)
		{
		    System.out.println(num+"is a Strongnumber");
		}else{
		    System.out.println(num+"is not a Strongnumber");
		}
	}
}