class test{
	void m()
	{
		System.out.println("hiii..M");
	}
	void n()
	{
		System.out.println("hii..N");
		this.m();
	}
}
public class This_Main{
	public static void main(String arg[])
	{
		test a=new test();
		a.n();
	}
}