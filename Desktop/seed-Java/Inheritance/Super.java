//package com.code;  
class Superclass {

    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}

class Subclass extends Superclass {

    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
}
  
public class Super  
{  
     
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();    
    }  
}  