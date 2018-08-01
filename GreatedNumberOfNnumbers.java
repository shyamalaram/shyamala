package array1;
import java.util.Scanner;
public class greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int max;
		//int number;
		System.out.println("enter the number:");
		Scanner in=new Scanner(System.in);
		//number=in.nextInt();
		n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements:");
				for(int i=0;i<n;i++){
				arr[i]=in.nextInt();	
			}
				max=arr[0];
				for(int i=1;i<n;i++){
					if(max<arr[i]){
						max=arr[i];
					}	
				}
				System.out.println("the max value is:"+max);	
			}   
			}
