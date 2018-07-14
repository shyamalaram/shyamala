package guvigithub;
import java.util.Scanner;
public class leapyear {
	public static void main(String args[]){
		int year;
		Scanner input=new Scanner(System.in);
		year=input.nextInt();
		if((year%4==0) && (year%400==0) &&(year%100==0)){
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}
	}

}
