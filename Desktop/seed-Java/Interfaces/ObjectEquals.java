public class ObjectEquals {

   public static void main(String[] args) {

      // get an integer, which is an object
      Integer x = new Integer(50);

      // get a float, which is an object as well
      Float y = new Float(50f);

      // check if these are equal,which is 
      // false since they are different class
      System.out.println("" + x.equals(y));

   }
}