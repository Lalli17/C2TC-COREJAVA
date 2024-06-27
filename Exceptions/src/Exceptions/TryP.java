package Exceptions;
import java.util.*;
public class TryP 
{
 int c;
 void div(int a,int b)
 {
	 try
	 {
		 c=a/b;
		 System.out.println("result="+c);
		 
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("cannot be divided by zero");
	 }
 }
 public static void main(String args[])
 {
	 TryP obj=new TryP();
	 System.out.println("enter n1 and n2");
	 Scanner sc=new Scanner(System.in);
	 int n1=sc.nextInt();
	 int n2=sc.nextInt();
	 obj.div(n1,n2);
	 sc.close();
 }
}
