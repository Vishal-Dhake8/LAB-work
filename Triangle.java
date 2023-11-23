package area;
import java.util.Scanner;
public class Triangle {
				static double TriAr(int h,int b){
					
			
				return (0.5*h*b);
				 }
		    public static void main(String args[]) {
		    
			System.out.println("Enter height & bredth");
	 		Scanner sc =new Scanner(System.in);
		    int h=sc.nextInt();
		    int b=sc.nextInt();
			System.out.println("Area:"+Triangle.TriAr(h, b));
}
}