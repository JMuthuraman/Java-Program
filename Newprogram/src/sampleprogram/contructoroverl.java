package sampleprogram;

 class contructoroverl1 {
	private int x;
	private float y;
	 contructoroverl1() {
	x = 0;
	y = 0.0f;
	}
	 contructoroverl1(int x) {
	this.x = x;
	this.y = y;
	}
    contructoroverl1(int x, float y) {
	this.x = x;
	this.y = y;
	}
	public String toString() {
	return "[x=" + x + ", y=" + y + "]";
	}
	}
	public class contructoroverl
	{
	public static void main(String[] args) {
	System.out.println(" Constructor Overloading ");
	
	contructoroverl1  p = new contructoroverl1 (); 
	System.out.println(p);
	contructoroverl1 s = new contructoroverl1 (10); 
	System.out.println(s);
	contructoroverl1  q = new contructoroverl1 (29, 77.3f); 
	System.out.println(q);
	}
	}

