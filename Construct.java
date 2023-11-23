package constructor;

public class Construct {
     int rn;
     String stdnam;
      
  Construct(int i, String string) {
	  rn=i;
	  stdnam=string;
		
  }
	
  void display()
  {
  System.out.println("Student Name:"+stdnam+"Students rollno"+rn);
  
  }

    
    public static void main(String[]args) {
    	Construct s1=new Construct(44,"Vishal");
    	
    	s1.display();
    }
     	
}
