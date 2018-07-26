package guvigithub;

import java.util.Scanner;

public class PowerOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int result=1;
		int power;
		System.out.println("enter the number:");
		System.out.println("enter the power:");
		Scanner in=new Scanner(System.in);
		number=in.nextInt();
		power=in.nextInt();
		while(power!=0){
			result*=number;
			power--;
		}
		System.out.println(result);
	
	}

}
