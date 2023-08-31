package sampleprogram;
import java.util.Stack;

public class Stackex {

	public static void main(String[] args) {
		        Stack<String> animals= new Stack<>();

		   //push element stacks
		        animals.push("green");
		        animals.push("blue");
		        animals.push("yellow");

		        System.out.println("Stack: " + animals);
		   // pop element stacks
		        String element1 = animals.pop();
		        System.out.println("Removed Element: " + element1);
		   // Access element from  top
		        String element2 = animals.peek();
		        System.out.println("Element at top: " + element2);
		   // Search  element
		        int position = animals.search("Horse");
		        System.out.println("Position of Horse: " + position);
		  // Check  stack is empty
		        boolean result = animals.empty();
		        System.out.println("Is the stack empty? " + result);
		        ;}
	}
