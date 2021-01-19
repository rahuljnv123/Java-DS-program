import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int T= sc.nextInt();
	     while(T--!=0){
	         int n = sc.nextInt();
	         int a[] = new int[n];
	         for(int i=0;i<n;i++){
	             a[i] = sc.nextInt();
	         }
	         int k = sc.nextInt();
	         solve(a,n,k);
	         System.out.println();
	     }
	 }
	 
	 public static void solve(int arr[],int n,int k){
	     Deque<Integer> dq = new LinkedList<>();
	     for(int i=0;i<k;i++){
	         if(arr[i]<0){
	             dq.add(i);
	         }
	     }
	     for(int i=k;i<n;i++){
	         
	         if(!dq.isEmpty()){
	             System.out.print(arr[dq.peek()]+" ");
	         }
	         else{
	             System.out.print("0"+" ");
	         }
	         
	         while(!dq.isEmpty() && i-k+1>dq.peek()){
	             dq.remove();
	         }
	         
	         if(arr[i]<0){
	             dq.add(i);
	         }
	         
	         if(!dq.isEmpty()){
	             System.out.print(arr[dq.peek()]+" ");
	         }
	         else{
	             System.out.print("0"+" ");
	         }
	         
	     }
	 }
}