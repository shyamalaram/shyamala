package guvigithub;
import java.util.Scanner;
public class MaxAmong10No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		Scanner ip=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("enter the numbers:");
		for(int i=0;i<10;i++){
			a[i]=ip.nextInt();
		}
		max=a[0];
		for(int i=1;i<10;i++){
			if(a[i]>=max){
				max=a[i];
			}
			}
		System.out.println("the maximum element in the array is:"+max);
	}
	}
