package array1;
import java.util.Scanner;
public class own {
    public static void main(String[] args) {
		int n;
		int max;
		int mi;
		System.out.println("enter the number:");
		Scanner in=new Scanner(System.in);
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
				mi=arr[1];
					for(int j=0;j<n;j++){
						if(mi>arr[j]){
							mi=arr[j];
							}
					}	
					System.out.println("the max value is:"+mi);	
				System.out.println("the max value is:"+max);
				}
			}   
			

  
