import java.util.Arrays;
 // To imports all classes of java.util package.
 // import java.util.*; 
 
 class SortArray {
   public static void main(String args[]) { 
     int [] arr = {30,40,10,20,50};
     Arrays.sort(arr);
     for(int i : arr)
       System.out.print(i + " ");     
   }
 }