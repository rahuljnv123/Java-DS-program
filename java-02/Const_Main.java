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
	Circle(double a,double b,double c)
	{
		x=a;
		y=b;
		r=c;
	}
}
public class Const_Main{
	public static void main(String args[])
	{
		Circle c=new Circle(0,0,2);//initialise during object creation
		System.out.println("circumference="+c.circumference());
		System.out.println("area="+c.area());
	}
}