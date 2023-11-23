package MethodCalling;
import java.util.*;
public class EvenOdd 
{
	public static void main(String args[]) 
	{ 
		  Scanner sc=new Scanner(System.in);
		  int input_no=sc.nextInt();
		  for(int i=0;i<=input_no;i++) 
		  {
		  System.out.println("Enter the no.");
		  int num=sc.nextInt();
		  
		  findEvenOdd(num);
		  }
	}
	
	
	public static void findEvenOdd(int num)
	{ 
		
		if(num%2==0)
			System.out.println(num+"is even");
		else
			System.out.println(num+"is odd");
	}

}
