import java.util.*;
public class RodCut{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rod size N:");
		int N = sc.nextInt();
		System.out.println("enter array size:");
		int s = sc.nextInt();
		int arr[] = new int[s];
		System.out.println("enter element:");
		for(int i=0;i<s;i++){
			arr[i] = sc.nextInt();
		}
		int res = solve(arr,N,s);
		System.out.println("output:"+res);
	}
	public static int solve(int arr[] , int N,int n){
		//int n = arr.length;
		if(n==0){
			return 0;
		}
		if(N==0){
			return 0;
		}
		if(arr[n-1]>N){
			return solve(arr,N,n-1);
		}
		else{
			return Math.max(1+solve(arr,N-arr[n-1],n),solve(arr,N,n-1));
		}
	}
}