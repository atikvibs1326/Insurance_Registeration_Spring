final class Parent 
{
    void showData() 
    {
        System.out.println("This is a method of final Parent class");
    }
}

//It will throw compilation error
class Child extends Parent 
{
    void showData() 
    {
        System.out.println("This is a method of Child class");
    }
}
public class FinalClass
{
    public static void main(String arg[])
    {
        Parent obj = new Child();
        obj.showData();
    }
}