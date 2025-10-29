class Harshadnumber 
{
    public static void main(String atgs[])
	{
	    int num=8800;
		int temp=num;
		int sum=0;
		while(temp>0)
		{
		    int digit= temp%10;
			sum+=digit;
			temp/=10;
		}
		if(num%sum==0)
		{
		    System.out.println(num+"is a Harshadnumber");
		}else{
		    System.out.println(num+"is not a Harshadnumber");
		
		}
	}
}