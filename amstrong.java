package guvigithub;
import java.util.Scanner;
public class AmstrongNumber {

	public static void main(String[] args) {
int number;
int temp;
int a=0;
int r=0;int startingnumber;
int endingnumber;
System.out.println("enter the number:");
Scanner input=new Scanner(System.in);
number=input.nextInt();
temp=number;
 while(number>0){
	 int b=number%10;	 
	 number=number/10;
 a=a+(b*b*b);
 }
 if(temp==a){
	 System.out.println("yes");
	
 }
else{
		 System.out.println("no");
 }
	}

}
