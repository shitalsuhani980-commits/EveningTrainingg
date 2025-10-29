import java.io.*;
 class buffer
 {
 public static void main(String arg[])throws IOException
 {
 InputStreamReader ir=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(ir);
 int a=Integer.parseInt(br.readLine());
 int b=Integer.parseInt(br.readLine());
 int c=a+b;
 System.out.println(c);
 }
 }