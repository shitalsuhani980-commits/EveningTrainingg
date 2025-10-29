class program1 
{
  public static void main(String[] args)
{
    int num=7;
    int f=0;
    for (int i=2;i<num-1;i++)
   { 
     if(num%i==0)
      {
        f=1;
        break;
      }

  }
  if(f==0)
       System.out.println("number is prime");


  
 
