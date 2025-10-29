import java.util.*;
import java.io.*;
class csed
{
   int a=10;
   int b=20;
   void display()
   {
	   system.out.println("i am a method of class CSED");
	  
   }
 }
 class csee 
 {
    int a=30;
	int b=40;
	void display()
	{
		system.out.println("i am a method of class CSEE");
  }
  class javanew1
 
  {
     public static void main(string[]args)
	 {
	  csed ob1=new csed(); 
	  csee ob2=new csee();
	  system.out.println(ob1.a);
	  system.out.println(ob2.b
	  ob1.display();
	  ob2.display();
	 }
    }