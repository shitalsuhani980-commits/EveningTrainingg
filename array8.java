class array8
{
    public static void main(String args[])
	{
	    int arr[]={10,25,30,45,20,50};
		int length=arr.length;
		int secondlarge= -1;
		int large= 1;
		for(int i=0;i<length;i++)
		{
			if(arr[i]>large)
			{
				secondlarge =large;
				large=arr[i];
			}
			else if(arr[i]>secondlarge && arr[i]!=large)
			{
				secondlarge=arr[i];
			}
		}
		System.out.println(secondlarge);
	}
}
		