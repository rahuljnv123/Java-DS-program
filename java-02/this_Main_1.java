class test
{
	test()
	{
		this(5);
	}
	test(int x)
	{
		System.out.println(x);
	}
}
class this_Main_1{
	public static void main(String args[])
	{
		test a=new test();
	}
}