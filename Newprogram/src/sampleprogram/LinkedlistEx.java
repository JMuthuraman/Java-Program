package sampleprogram;
import java.util.*;
public class LinkedlistEx 
{
	       public static void main(String args[])
	       {
	           LinkedList list = new LinkedList();
	           list.add(new Integer(3));
	           list.add(new Integer(9));
	           list.add(new Integer(6));
	           list.add(new Integer(1));
	           Iterator i = list.iterator();
	           Collections.reverse(list);
		    Collections.sort(list);
	           while(i.hasNext())
		        System.out.print(i.next() + " ");
	       }
	   }


