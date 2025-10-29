class holotriangle
{
    public static void main(String args[])
	{
	    int n=6;
		int cols=2*n-1;
		for(int i=1;i<=n;i++)
		{
		    int left=n-i+1;
			int right=n+i-1;
			for(int j=1;j<=cols;j++)
			{
			    if(j==left||j==right||i==n)
				{
				    System.out.print("*");
				}
				else
				{
				    System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}