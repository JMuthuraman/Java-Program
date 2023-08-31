package sampleprogram;

public class Thiskeyword {
	int rollno;
	String name;
	float fee;
	Thiskeyword(int r,String n,float f)
	{
	rollno=r;
	name=n;
	fee=f;
	}
	void display()
	{
	System.out.println(rollno+" "+name+" "+fee);
	}
	}
	class TestThis1
	{
	public static void main(String args[])
	{
	Thiskeyword s=new Thiskeyword(10,"kumaran",30000f);
	Thiskeyword s2=new Thiskeyword(11,"Nandha",10000f);
	s.display();
	s2.display();
	}

}
