package guvigithub;
import java.util.Scanner;
public class MedianElemen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("enter the number:");
Scanner input=new Scanner(System.in);
n=input.nextInt();
String num=Integer.toString(n);
if(num.length() % 2 != 0){
	System.out.println(num.length()%2);
    System.out.println("The mid digit of " + n + " is " +  num.charAt(num.length()/2));
}else {
    System.out.println("No middle number.");
}
	}

}
