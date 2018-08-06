package guvigithub;
import java.util.Scanner;
public class PrimeBet2Interval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s;
int e;
int i;
int count=0;
System.out.println("enter the s:");
System.out.println("enter the e:");
Scanner input=new Scanner(System.in);
s=input.nextInt();
e=input.nextInt();
for(i=s+1;i<e;i++){
	for(int j=2;j<i;j++){
		if(i%j==0){
			count++;
			break;
		}
		else{
			count=1;
			}
		if(count==1){
			System.out.print(i+" ");
			break;
		}
	}
}
}
}
