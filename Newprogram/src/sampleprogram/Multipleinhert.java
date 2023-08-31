package sampleprogram;
interface A
{
	abstract void display1();
}
interface B
{
	public abstract void display2();
}
 class C implements A,B
{
	public void display1()
	{
		System.out.println("welcome to");
	}
	public void display2()
	{
		System.out.println("eclipse");
	}
	
}
public class Multipleinhert 
{

	public static void main(String[] args) {
		C obj=new C();
		obj.display1();
		obj.display2();
	}

}
