class array5
{
    public static void main(String args[])
	{
	    int arr[]={1,2,3,4,5};
		int smallest=arr[0];
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
		    if(arr[i]<smallest)
			{
			    smallest=arr[i];
		    }
			System.out.println("smallest element in the array"+smallest);
	}
}
}