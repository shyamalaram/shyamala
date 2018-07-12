package pos;
import java.util.*;
public class pneg {
	public static void main(String[] args){
		int n;
		Scanner in=new Scanner(System.in);
	
		 n=in.nextInt();
		 if(n>=1){
			 System.out.println("positive");
			 
		 }
		 else if( n==0) {
			System.out.println("zero"); 
		 }
		 else{
			 System.out.println("negative");
		}
	}

}

