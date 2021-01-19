import java.util.*;
import java.lang.*;


public class Graphtry{
	private int v;
	private int arr[][];
	
	public Graphtry(int v){
		this.v = v;
		arr = new int[v][v];
	}
	public void addedge(int i,int j){
		arr[i][j]=1;
		arr[j][i]=1;
	}
	public void print(int v){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i][0]+" ");
			for(int j=1;j<arr[0].length;j++){
			    System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
	}
	
	
	public static void main(String args[]){
		
		Graphtry obj = new Graphtry(4);
		obj.addedge(0,1);
		obj.addedge(0,2);
		obj.addedge(0,3);
		obj.addedge(1,2);
		
		obj.print(4);
		
	}
}