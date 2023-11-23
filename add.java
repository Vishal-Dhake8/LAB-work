package project;

class add {
	int Add (int x, int y)
	{
	   int	sum=x+y;
	   return sum;
	   
		
	}

	public static void main(String[] args) 
	{
	  int a = 10,b = 20;
	  AddNumber n = new AddNumber();
	  int result=n.Add(a,b);
	  System.out.Println("the addition is",+result);
	

	}

}
