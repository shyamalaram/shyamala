package guvigithub;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
int fact=1;
int i;
System.out.println("enter the numbers:");
Scanner input=new Scanner(System.in);
num=input.nextInt();
for(i=1;i<=num;i++){
	fact=fact*i;
}
System.out.println(fact);
	}

}
