package guvigithub;
import java.util.Scanner;
public class StringIsNumeric {
public static void main(String[] args) {
String s="";
char ss=0;
System.out.println("enter the String:");
Scanner ip=new Scanner(System.in);
s=ip.nextLine();
if(s.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")){
	System.out.println("numeric");
}
else{
	System.out.println("not numeric");
}

	}
}
