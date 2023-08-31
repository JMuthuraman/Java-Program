package sampleprogram; 
 public class Objprgm 
 { 
    int side; 
    Objprgm()
    { 
       side = 45;
} 
void calArea()
{ 
  int area = side * side; 
  System.out.println("Area: " +area); 
} 
void calPerimeter()
{ 
  int perimeter = 4 * side; 
  System.out.println("Perimeter: " +perimeter); 
 } 
public static void main(String[] args) 
{ 
	Objprgm s= new Objprgm (); 
   s.calArea(); 
   s.calPerimeter();
}

}
