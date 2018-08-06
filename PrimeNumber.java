package guvigithub;
import java.util.Scanner;
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
int count=0;
System.out.println("enter the number:");
Scanner ip=new Scanner(System.in);
num=ip.nextInt();
for(int i=1;i<=num;i++){
if(num%i==0){
	count++;
}
}
	 if(count==2){
		 System.out.println("yes");
	 }
	 else{
		 System.out.println("no");
	 }

}
}
	
	
