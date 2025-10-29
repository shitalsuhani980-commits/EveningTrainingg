class Disariumnumber1
{
    public static void main(string args[])
	{
	    int num=135;
		int temp=num,sum=0;
		int length=Integer.toString(num).length();
		while(temp>0)
		{
			int digit=temp%10;
			sum+=Math.pow(digit,length);
			length--;
			temp/=10;
		}
		if(sum==num)
			System.out.println(num+"is a disarium number");
		        else
					System.out.println(num+"is not a disarium number");
	}
}