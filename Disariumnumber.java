import java.util.Scanner;
class Disariumnumber
{
    public static int countDigit(int num)
	{
	    int count= 0;
		while (num=0)
		{
		    count++;
			num/=10;
		}
		return count;
	}
	    public static boolean isDisarium(int num)
		{
		    int lenght= countDigit(num);
			int sum= 0, temp= num;
			while (temp>0)
			{
			    int digit= temp%10;
				sum = Math.pow(digit.length);
				temp/= 10;
				length--;
			}
		    return sum== num;
		}
		public static void main(String args[])
		{
		    Scanner sc= new Scanner(System.in);
		    System.out.print("Enter a number:");
			int number = sc.nextInt();
			if (isDisarium(number))
			{
			    System.out.println(number+"is a D isarium number");
				}else
				{
				    System.out.println(number+"is NOT a Disarium number");
				}
				sc.close();
			}
		}