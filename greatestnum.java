package guvigithub;
import java.util.Scanner;
public class largestnoamongthreenum {
public static void main(String args[]){
	int x;
	int y;
	int z;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the values:");
	x=input.nextInt();
	y=input.nextInt();
	z=input.nextInt();
if((z>y)||(z>y)){	
	System.out.println(z);
	}
else if((y>x)||(y>z)){
	System.out.println(y);
}
else{
	System.out.println(x);
}
}

}
