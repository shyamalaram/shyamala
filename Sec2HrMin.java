package guvigithub;
import java.util.Scanner;
public class Sec2HrMins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sec=0;
System.out.println("enter the seconds:");
Scanner in=new Scanner(System.in);
sec=in.nextInt();
int s1=sec%60;
int s2=sec/60;
int s3=s2%60;
s2=s2/60;
System.out.println(s3+" "+s1);
	}

}
