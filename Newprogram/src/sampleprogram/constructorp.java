package sampleprogram;

public class constructorp {

	int id;
	String name;
	long phno;
	constructorp(int i,String n,long p)
	{
	id = i;
	name = n;
	phno=p;
	}
	void display()
	{
	System.out.println(id+" "+name+" "+phno);
	}
	public static void main(String args[])
	{
		constructorp obj = new constructorp(201,"Ravi",638389399);
		constructorp obj1 = new constructorp(202,"Muthu",837737838);
	obj.display();
	obj1.display();
	}
	
}
