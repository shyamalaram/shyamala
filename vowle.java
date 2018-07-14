package guvigithub;
import java.util.Scanner;
public class vowleconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char ch;
char i=0;
Scanner input=new Scanner(System.in);
ch=input.next().charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
System.out.println("vowel");	
}
else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
	System.out.println("consonant");
	}
else{
	System.out.println("not a alphabet");
}
}
}
