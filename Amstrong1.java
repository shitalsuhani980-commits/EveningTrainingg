import java.util.*;
class Amstrong1
{
   public static void main(Stringargs[])
   {
      Scanner sc=new Scanner(system.in);
	  System.out.println("enter a number");
	  int m = sc.nextInt();
	  for(int i=1;i<1000;i++)
	  {
	    int sum=0;
		int digit=0;
		int m=i;
		while(m!=0)
		{
		   m=m/10;
		   digit++;
		}
		   int r=m%10;
		   sum=sum+(int)Math.pow(r,digit);
		   m=m/10;
		}
		   if(sum==i)
		     system.out.println(i);
			}
	    } 
	}
		  