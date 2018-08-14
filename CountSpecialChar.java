package guvigithub;
import java.util.Scanner;
public class CountSpecialCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="";
int count=0;
System.out.println("enter the string:");
Scanner input=new Scanner(System.in);
str=input.nextLine();
int l=str.length();
for(int i=0;i<l;i++){
	if(str.charAt(i)>=33&& str.charAt(i)<=47||str.charAt(i)>=123&&str.charAt(i)<=126||str.charAt(i)>=58&&str.charAt(i)<=64||str.charAt(i)>=91&&str.charAt(i)<=96){
count++;
	}
	}
System.out.println(count);
}
}
