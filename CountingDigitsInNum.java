package guvigithub;
import java.util.Scanner;
public class CountNumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number;
int count=0;
System.out.println("enter the number:");
Scanner input=new Scanner(System.in);
number=input.nextInt();
while(number!=0){
	number/=10;
	count++;
}
System.out.println(count);
	}

}
