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
public class CircleMain{
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.x=c.y=0;
		c.r=2;
		System.out.println("circumference="+c.circumference());
		System.out.println("area="+c.area());
	}
}