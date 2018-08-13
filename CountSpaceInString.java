package guvigithub;
import java.util.Scanner;
public class CountNoOfSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		int count=0;
		int i;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string:");
		str=input.nextLine();
		int l=str.length();
		for(i=0;i<l;i++){
			 if(Character.isWhitespace(str.charAt(i))) {
				 count++;
			 }
		}
		System.out.println(count);
		}

}
