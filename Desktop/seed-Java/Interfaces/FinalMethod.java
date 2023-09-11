class Parent {
    
	public final void display()
	{
        System.out.println("This is a final method.");
    }
}
class Child extends Parent
{   
	public void display()
	{
         System.out.println("Overiding in child");
    }
}

public class FinalMethod {
    
   public static void main(String args[]){
      
	  Child obj = new Child();
        // calling the final method from the child class object.
        obj.display();
   }
}