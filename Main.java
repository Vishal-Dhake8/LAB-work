package exception1;


	import java.util.Scanner;
	public class Main {
	 static void checkAge() {
	int n;
	Scanner s = new Scanner(System.in);
	 System.out.print("Enter the number you want to check:");
	 n = s.nextInt();
	 if (n% 2 == 0) {
	 throw new ArithmeticException("Even no");
	 }
	 else {
	 System.out.println("Odd no");
	 }
	 }
	 public static void main(String[] args) {
	 checkAge(); 
	 }
	}


