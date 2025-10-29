class countarray
{
    public static void main(String args[])
	{
	    int arr[]={10,20,10,30,20,10,40};
		boolean[]visited= new boolean[arr.length];
		System.out.println("element|count");
		System.out.print("my key value is times appear");
		for(int i=0;i<arr.length;i++)
		{
		    if(visited[i])
			continue;
			int count=1;
			for(int j=i;j<arr.length;j++)
			{
			    if(arr[i]== arr[j])
				{
				    visited[j]=true;
					count++;
				}
			}
			System.out.println(" "+arr[i]+"   |   "+count);
		}
	}
}