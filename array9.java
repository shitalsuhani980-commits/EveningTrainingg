class array9
{
    public static void main(String args[])
	{
	    int arr[]={10,25,30,45,20,50};
		int first,second,third;
		first=second=third= Integers.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>first)
			{
			    third=second;
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]!=first)
			{
			    third=second;
				second=arr[i];
			}
			else if(arr[i]>third && arr[i]!=second && arr[i]!=first)
			{
			    third=arr[i];
			}
		}
		System.out.println("third largest elemet is"+third);
	}
}
		