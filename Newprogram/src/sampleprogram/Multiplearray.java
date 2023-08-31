package sampleprogram;
import java.util.Arrays;
public class Multiplearray {
	public static void main(String[] args) {
		int b[][]= {{10,15},{35,40}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(b[i][j]);
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(b[i][j]%2==0)
				{
					System.out.println(b[i][j]+" is even");
				}
				else
				{
					System.out.println(b[i][j]+" is odd");
					
				}
			}
		}
	}
}
