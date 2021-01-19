public class Testbreak{
    public static void main(String [] args){
		if(true){
			System.out.println("one");
			for(int i=1;i<10;i++)
			{
				if(i%2==0){
					System.out.println("two");
					break;
				}
			}
			//System.out.println("two");
		}
	}
}