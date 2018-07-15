package guvigithub;
import java.util.Scanner;
public class AdditionOfNumbers {

	public static void main(String[] args) {
int n;
int sum=0;
System.out.println("enter the values of n:");
Scanner input=new Scanner(System.in);
n=input.nextInt();
for(int i=0;i<=n;i++){
	sum=sum+i;
}
System.out.println(sum);
	}

}
