package guvigithub;
import java.util.Scanner;
public class StringRepeatForNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="";
int n=0;
System.out.println("enter the String:");
System.out.println("enter the n:");
Scanner input=new Scanner(System.in);
str=input.nextLine();
n=input.nextInt();
for(int i=0;i<n;i++){
	System.out.println(str);
}
	}
}
