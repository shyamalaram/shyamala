package guvigithub;
import java.util.Scanner;
public class minimunnumber {

	public static void main(String[] args) {
		int n=10;
		int min;
		Scanner in=new Scanner(System.in);
		int arr[]=new int[n];
		System.out.println("enter the elements:");
				for(int i=0;i<n;i++){
				arr[i]=in.nextInt();	
			}
				min=arr[0];
				for(int i=1;i<n;i++){
					if(min>arr[i]){
						min=arr[i];
						}
				}
	System.out.println("the minimum number is:"+min);
	}
	

}
