class searchingarray
{
    public static void main(String args[])
	{
	    int arr[]={10,20,30,60,70};
		int search=30;
		boolean found= false;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]== search)
			{
		        System.out.println(search+ "found at position"+(i+1));
				found=true;
				break;
			}
		}
		if(found)
		{
		    System.out.println(search+"not found in the array");
		}
	}
}
