package sampleprogram;

public class Methodobj {
	   int length; 
	   int breadth; 
	
	   void perValue(int l, int b)
	   { 
	      length = l; 
	      breadth = b; 
	   } 
	  void calculate()
	  { 
	    int perimeter = 2*(length + breadth); 
	    System.out.println("Perimeter of the Rectangle:" +perimeter); 
	  } 
	 public static void main(String[] args)
	 {
	    Methodobj obj = new Methodobj(); 
	    obj.perValue(50,50); 
	    obj.calculate();
	 }

}
