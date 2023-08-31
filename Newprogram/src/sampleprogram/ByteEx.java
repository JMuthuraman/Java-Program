package sampleprogram;

public class ByteEx 
	   {
	       public static void main(String args[])
	       {       
	            byte x = 64;                                //x*2n  decimal =5 101 10=1010 40=101000
	            int i;
	            byte y;
	            i = x << 2;                               
	            y = (byte) (x << 2);
	            System.out.print(i + " " + y);
	       }

}
