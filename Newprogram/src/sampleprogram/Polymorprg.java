package sampleprogram;

	class Shape {
	    public void draw() {
	        System.out.println("Draw a shape");
	    }
	}

	class Circle extends Shape {    
	    public void draw() {
	        System.out.println("Draw a circle");
	    }
	}

	class Square extends Shape {
	    public void draw() {
	        System.out.println("Draw a square");
	    }
	}

	public class Polymorprg {
	    public static void main(String[] args) {
	        Shape s1 = new Circle();
	        Shape s2 = new Square();
	        s1.draw();//circle class method
	        s2.draw(); //square class method
	    }
	}


