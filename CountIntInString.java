package guvigithub;

import java.util.Scanner;

public class CountTheNumbericInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="";
int count=0;
System.out.println("enter the string:");
Scanner input=new Scanner(System.in);
 str=input.nextLine();
 int l=str.length();
 for(int i=0;i<l;i++){
	 if(str.charAt(i)>=48 &&str.charAt(i)<=57){
		 count++;
	 }
 }
 System.out.println(count);
	}

}
