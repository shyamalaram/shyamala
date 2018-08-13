package guvigithub;
import java.util.Scanner;
public class CountTheChar {

	public static void main(String[] args) {
String str;
int count=0,count1=0,count2=0,count3=0;
System.out.println("enter the string:");
Scanner input=new Scanner(System.in);
str=input.nextLine();
int l=str.length();
char ch[] =str.toCharArray();
for(int i=0;i<l;i++){
	if(ch[i]>=33&&ch[i]<=127){
	count++;
	}
}
System.out.println(count);
	}
}
