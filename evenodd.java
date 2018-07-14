package demo;
import java.util.Scanner;
public class evenodd {
public static void main(String args[]){
	int num;
	Scanner input=new Scanner(System.in);
	num=input.nextInt();
	if(num%2==0){
		System.out.println("even");
	}
		else{
			System.out.println("odd");
		}
	
}
}
