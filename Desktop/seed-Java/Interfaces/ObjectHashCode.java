public class ObjectHashCode {
    
	int last_roll = 100;  
    int roll_no; 
    
    public static void main(String args[]) 
    { 
        ObjectHashCode obj = new ObjectHashCode(); 
        // Below two statements are equivalent 
        System.out.println("HashCode : " + obj.hashCode()); 
    } 
}
