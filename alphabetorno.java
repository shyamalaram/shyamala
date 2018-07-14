package guvigithub;
import java.util.Scanner;
public class alphabetornot {
public static void main(String args[]){
	char ch;
	char i=0;
	Scanner input=new Scanner(System.in);
	ch=input.next().charAt(i);
	if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
		System.out.println("alphabet");
	}
	else{
		System.out.println("No");
	}
}
}
