package sampleprogram;
import java.util.Iterator;
import java.util.Stack;
public class Stackex1 {
			public static void main(String[] args) {
				Stack<String> listsk=new Stack<>();
				boolean result=listsk.empty();//empty stack
				System.out.println("Is the stack is empty?:"+result);
				listsk.push("blue");
				listsk.push("green");
				listsk.push("red");
				listsk.push("yellow");
				listsk.push("white");
				System.out.println("The stack is:"+listsk);
				Iterator<String> sr=listsk.iterator();
				while(sr.hasNext())
				{
					System.out.println(sr.next());
				}
				boolean result1=listsk.empty();
				System.out.println("Is the stackk is empty?"+result1);
				String Remove=listsk.pop();
				System.out.println("Stack is removed:"+ Remove);
				String firstel=listsk.peek();
				System.out.println("The first element is:"+firstel);
				int searchingel=listsk.search("green");
				System.out.println("searching element is:"+searchingel);
			}

		}
