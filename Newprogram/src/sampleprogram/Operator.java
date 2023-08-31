package sampleprogram;

public class Operator {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=50;
		int d=a+b;
		int e;
		System.out.println("Arithmetic operator");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(b*a);
		System.out.println(c/a);
		
		System.out.println("Logical operator");
		System.out.println(a>b&&a<c);
		System.out.println(a<b||a>c);
		
		System.out.println("relational operator");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a|b);
		System.out.println(a=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		System.out.println("assignment operator");
		System.out.println(d+=a);
		System.out.println(d-=a);
		System.out.println(d*=a);
		
		System.out.println("ternary operator");
		System.out.println(a<c?a:b);
		
		System.out.println("++ and -- operator");
		System.out.println(e=+a);
		System.out.println(e=a++);
		System.out.println(e=-a);
		System.out.println(e=a--);
	}
}

