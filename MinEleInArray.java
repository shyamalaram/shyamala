package guvigithub;
import java.util.Scanner;
public class MinNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0;
		int n;
		System.out.println("enter the number of elements in the array:");
		Scanner ip=new Scanner(System.in);
		n=ip.nextInt();
		int a[]=new int[n];
		System.out.println("enter the n:");
		for(int i=0;i<n;i++){
			a[i]=ip.nextInt();
		}
		min=a[0];
		for(int i=1;i<n;i++){
			if(a[i]<=min){
				min=a[i];
			}
			}
		System.out.println("the minimum element in the array is:"+min);
	}
	}
