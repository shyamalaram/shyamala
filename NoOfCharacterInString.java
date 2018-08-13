package guvigithub;
import java.util.Scanner;
public class CountTheChar {

	public static void main(String[] args) {
String str;
int count=0,count1=0,count2=0;
System.out.println("enter the string:");
Scanner input=new Scanner(System.in);
str=input.nextLine();
int l=str.length();
char ch[] =str.toCharArray();
for(int i=0;i<l;i++){
if(ch[i]>='a'&&ch[i]<='z'){
	count1++;
	}
if(ch[i]>='A'&&ch[i]<='Z'){
count2++;
}
 count=count1+count2;
}
System.out.println(count);
	}
}
