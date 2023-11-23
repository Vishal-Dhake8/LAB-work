package parmeterized_constructor_box;



public class Box {
double length;
double width;
double height;
  public Box(double l,double h, double w) {
	  length=l;
	  width=w;
	  height=h;
	  
  }
  double volume() {
	  return length*width*height;
  }
  public static void main(String[]args) {
	  Box box1 = new Box(1, 40.99, 600.99);
      Box box2 = new Box(2, 37.0, 300.99);
      Box box3 = new Box(2, 90.88, 300.99);

   System.out.println("vol of Box1:"+box1.volume());
   System.out.println("vol of Box2:"+box2.volume());
   System.out.println("vol of Box3:"+box3.volume());
  }
}
