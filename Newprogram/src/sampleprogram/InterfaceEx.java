package sampleprogram;

	interface Stud 
	{
	    public void data();	 
	}
	
	class stu implements Stud
	{
	    public void data ()
	    {
	        String name="Muthu";
	        int rollno=40;
	        String degree="Mca";
	        System.out.println("My name is:"+name);
	        System.out.println("Rollno:"+rollno);
	        System.out.println("Degree:"+degree);
	    }
	}
	public class InterfaceEx {
	    public static void main (String args [])
	    {
	        stu h= new stu();
	        h.data();
	    }
	}
