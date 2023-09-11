package com.seed;
class StaticVariable

{
    int rollno;
    String name;
    static String college ="DYPATIL"; 

    
    StaticVariable(int r,String n)
    {
        rollno = r;
        name = n;
    }
    
    
    void display()
    {
        System.out.println(rollno+" "+name+" "+college); 
    }

    public static void main(String args[])
    {
        StaticVariable s1 = new StaticVariable(101,"Gagan");
        StaticVariable s2 = new StaticVariable(102,"Raman");
        s1.display();  
        s2.display();   
    }

}