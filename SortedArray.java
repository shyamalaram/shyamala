package guvigithub;
import java.util.Scanner;
public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int temp;
int i;
System.out.println("enter the number of elements in the Array:");
Scanner input=new Scanner(System.in);
n=input.nextInt();
int aee[]=new int[n];
System.out.println("enter the n:");
for(i=0;i<n;i++){
	aee[i]=input.nextInt();
}
for( i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(aee[i]>aee[j]){
			temp=aee[i];
			aee[i]=aee[j];
			aee[j]=temp;
		}
	}
}
System.out.print("Ascending Order:");
for (i = 0; i < n; i++) 
{
    System.out.print(aee[i] + " ");
}
	}
}
