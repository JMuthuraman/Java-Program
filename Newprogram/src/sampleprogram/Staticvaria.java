package sampleprogram;

	class Student
	{
	int rollno ;
	String name;
	static String college="bhc" ;
	Student(int r, String n)
	{
	rollno = r;
	name = n;
	}
	void display ()
	{
	System.out.println("data from the student:");
	System.out.println(rollno+" "+name+" "+college);
	}
	}
	public class Staticvaria
	{
	public static void main(String args[])
	{
	Student s1 = new Student(101,"arun");
	Student s2 = new Student(202,"muthu");
	s1.display();
	s2.display();
	}	

}
