class consecutive1
{
    public static void main(String args[])
	{
	    int arr[]={0,0,0,1,1,1,1,0,0,1,1,0,0};
		int max0=0;
		
		for(int i=1;i<length;i++)
		{
			if(arr[i]==arr[i-1])
			{
				count++;
			}
			else {
				maxcount=Math.max(maxcount,count);
				count=1;
			}
		}
		System.out.println(maxcount);
	}
}