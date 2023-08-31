package sampleprogram;

public class Copyconstructor {
	int id;
	String name;
	Copyconstructor (int i,String n)
	{
	id = i;
	name = n;
	}
	Copyconstructor (Copyconstructor  s)
	{
	id = s.id;
	name =s.name;
	}
	void display()
	{
	System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		Copyconstructor  s1 = new Copyconstructor (40,"Muthuraman");
		Copyconstructor  s2 = new Copyconstructor (s1);
	s1.display();
	s2.display();
}
}
