package guvigithub;
import java.util.Scanner;
public class CountTheLineInPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="";
int count=1;
	System.out.println("enter the string:");
	Scanner input=new Scanner(System.in);
	str=input.nextLine();
	for(int i=0;i<str.length();i++){
	if(str.charAt(i)==46){
		count++;
	}
	}
	System.out.println(count);
}
	
}	
