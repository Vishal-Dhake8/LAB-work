package basic_sal;

import java.util.*;
public class basic_sal {
public static void main(String[]args)
{     
	
	int basicsal,DA,HRA,Total;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter basic salary");
	basicsal= sc.nextInt();
	DA=(10*basicsal)/100;
	HRA=(20*basicsal)/100;
	Total=DA+HRA+basicsal;
	System.out.println("the DA is"+DA);
	System.out.println("the HRA is"+HRA);
	System.out.println("total salary is"+Total);

}
}
