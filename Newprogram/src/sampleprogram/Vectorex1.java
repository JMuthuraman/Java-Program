package sampleprogram;
import java.util.Iterator;
import java.util.Vector;
public class Vectorex1 {
		public static void main(String[] args) {
			Vector<Integer> m=new Vector<>();
			m.add(100);
			m.add(200);
			m.add(300);
			m.add(400);
			m.add(100);
			m.add(200);
			m.add(600);
			System.out.println("size of the vector:"+m.size());
			System.out.println("Capacity of the vector:"+m.capacity());
			
			Iterator<Integer> sr=m.iterator();
			while(sr.hasNext())
			{
				System.out.println(sr.next());
				
			}
			
			m.add(200);
			m.add(360);
			m.add(500);
			System.out.println("now the size of vector:"+m.size());
			System.out.println("now the capacity of vector:"+m.capacity());
			if(m.contains(360))
			{
				System.out.println("360 is on the vector:"+m.indexOf(360));
				
			}
			else
			{
				System.out.println("vector 360 is not in the element");
			}
	       
			System.out.println("first element in the vector is:"+m.firstElement());
		
			System.out.println("last element in the vector is:"+m.lastElement());
			//Remove first occurence in the element
			System.out.println("Remove the element in the element"+m.remove((Integer)200));
		    //display the vector
			System.out.println("vector is"+m);
			//Hashcode of the vector 
			System.out.println("Hash code of the vector is:"+m.hashCode());
			//get the element at specified index
			System.out.println("element of index is:"+m.get(6));
		}
			}


