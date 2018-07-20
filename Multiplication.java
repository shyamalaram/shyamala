package guvigithub;
import java.util.Scanner;
public class MultiblicationTabel {
public static void main(String args[]){
	int num=5;
	int mul,tab;
	System.out.println("enter the value of tab:");
   Scanner input=new Scanner(System.in);
   tab=input.nextInt();
   for(int i=1;i<=num;i++){
	   mul=tab*i;
	   System.out.println(mul);
    }
}
}
