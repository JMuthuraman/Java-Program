package sampleprogram;
class hr
{
     void disp()
    {
        System.out.println(" hr class");
    }
}
 interface empl1
{
    public abstract void show();
}
interface empl2 
{
    public abstract void show();
}
public class hybridinhert extends hr implements empl1,empl2
{
    public void show()
    {
        System.out.println("  interface class ");
    }
    public void dispD()
    {
        System.out.println("  hybridinhert class");
    }
    public static void main(String args[])
    {
    	hybridinhert obj = new hybridinhert();
        obj.dispD();
        obj.show();
        obj.disp();
    }
}
