package Intdeclaration;
import java.util.*;
public class Addition {
	 public static void main(String[]args)
	 {
		 System.out.println("Enter two numbers:");
		  Scanner sc= new Scanner(System.in);
		  
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  int c=add(a,b);
		  System.out.println("Addition is"+c);
	 }
       
	 public static int add(int n1,int n2)
	 {
		  int s;
		  s=n1+n2;
		  return s;
	 }
}
