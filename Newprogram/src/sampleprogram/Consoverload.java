package sampleprogram;

public class Consoverload {
	int id;
	String name;
	int age;
	Consoverload(int i,String n)
	{
	id = i;
	name = n;
	}
	Consoverload(int i,String n,int a)
	{
	id = i;
	name = n;
	age=a;
	}
	void display()
	{
	System.out.println(id+" "+name+" "+age);
	}
	public static void main(String args[])
	{
		
	Consoverload obj = new Consoverload(40,"muthu");
	Consoverload obj2 = new Consoverload(28,"ram",23);
	obj.display();
	obj2.display();
}
}
