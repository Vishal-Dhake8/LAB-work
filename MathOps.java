package Mathcal;
import java.util.*;
public class MathOps 
{
public static void main(String[]args)
 {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the first no.:");
	int num1=sc.nextInt();
	
	System.out.println("Enter second no.:");
	double num2=sc.nextDouble();
	
	System.out.println("Enter third no.:");
	 float num3=sc.nextFloat();
	 
	 System.out.println("the maximum no. is:"+Math.max(num1, num2));
	 System.out.println("The min no. is:"+Math.min(num1, num2));
	 System.out.println("round no:"+Math.round(num3));
	 System.out.println("Absolute no:"+Math.abs(num2));
	 System.out.println("log of no is"+Math.log(num3));
 }
}
