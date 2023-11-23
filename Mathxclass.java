package classarray;
 import java.util.*;
 import java.lang.*;
public class Mathxclass {
	
	 public static void main( String[]args)
	 {
		 System.out.println("enter two numbers:");
		  Scanner scan=new Scanner(System.in);
		  int a=scan.nextInt();
		  int b=scan.nextInt();
		  double c= scan.nextDouble();
		  double d= scan.nextDouble();
		  
		
		  System.out.println("Maximum no. is"+Math.max(a,b));
		  System.out.println("Min no. is"+Math.min(a, b));
		  System.out.println("The Absolute value of c is:"+Math.abs(c));
		  System.out.println("the round val is:"+Math.round(d));
		  System.out.println("Square root is"+Math.sqrt(a));
	 }
	//int a,b,c,d;

}
