class Circle{
	double x,y; //coordinate
	double r;  //radius
	public double circumference()
	{
		return 2*3.14*r;
	}
	public double area()
	{
		return 3.14*r*r;
	}
}
// BOX CLASS

class Box{
	double l,b,h; //dimension
	public double area()
	{
		return l*b;
	}
	public double volume()
	{
		return l*b*h;
	}
}
public class MulticlassMain{
	public static void main(String args[])
	{
		Circle c=new Circle(); //object of circle class
		Box b=new Box(); //object of BOx class
		c.x=c.y=0;
		c.r=2;
		b.l=b.b=b.h=2;
		System.out.println("circumference="+c.circumference());
		System.out.println("area="+c.area());
		System.out.println("Box area="+b.area());
		System.out.println("volume="+b.volume());
	}
}