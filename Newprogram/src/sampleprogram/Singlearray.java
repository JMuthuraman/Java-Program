package sampleprogram;
import java.util.Arrays;
import java.util.Scanner;
public class Singlearray {
	public static void main(String[] args) {
		int i,n;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n numbers");
		n=s.nextInt();
		for(i=0;i<n;i++)
		 {
			 System.out.println("enter value");
			 a[i]=s.nextInt();
		 }
		 System.out.println("array is:");
		 System.out.println(Arrays.toString(a));
	}
		
	}
