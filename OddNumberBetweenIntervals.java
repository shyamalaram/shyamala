package guvigithub;
import java.util.Scanner;
public class oddBetTwoInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sn=0;
int en=0;
System.out.println("enter the Starting number:");
System.out.println("enter the ending number");
Scanner in=new Scanner(System.in);
sn=in.nextInt();
en=in.nextInt();
for(int i=sn;i<=en;i++){
	while(i%2!=0){
		System.out.println(i);
		break;
	}
}
	}

}
