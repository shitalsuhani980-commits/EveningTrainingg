class array4
{
    public static void main(String args[])
	{
	    int arr[]={10,20,30,40,50};
		int largest=arr[0];
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
		    if(arr[i]>largest)
			{
			    largest=arr[i];
		    }
			System.out.println("largest element in the array"+largest);
	}
}
}