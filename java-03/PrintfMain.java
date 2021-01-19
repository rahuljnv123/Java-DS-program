class PrintfMain
{
	public static void main(String [] args)
	{
		int x=100;
		System.out.printf("printing simple integer: x=%d\n",x);
		
		//this will print it upto 2 decimal places
		System.out.printf("formatted with precision:pi=%.2f\n",Math.PI);
		
		 float n=5.2f;
		 
		 //automatically append zero to the rightmost part decimal
		 System.out.printf("formatted to specific width:n=%6.1f\n",n);
		 
		 n=123454.3f;
		 //here number is formatted from right margin and occupies and
		 //width of 20 character;
		 
		 System.out.printf("formatted to right margin:n=%20.2f\n",n);
	}
}