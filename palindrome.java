package array;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
int number;
int rem=0,r=0;
System.out.println("enter the number:");
Scanner ip=new Scanner(System.in);
number=ip.nextInt();
int b=number;
	while(number>0){
		 rem=number%10;
		 r=r*10+rem;
		number=number/10;
	}
	if(r==b){
	System.out.println("yes");	
}
	else{
		System.out.println("no");
	}
	
	}

}
