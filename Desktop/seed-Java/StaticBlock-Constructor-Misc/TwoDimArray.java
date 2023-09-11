package com.seed;
public class TwoDimArray {
    public static void main(String args[]) {
        int[][] StudentMarks = new int[3][3];
        
        // Marks Attained By Student 1
        StudentMarks[0][0] = 90;  // English
        StudentMarks[0][1] = 70;  // Maths
        StudentMarks[0][2] = 84;  // Science
        
        // Marks Attained By Student 2
        StudentMarks[1][0] = 75;  // English
        StudentMarks[1][1] = 77;  // Maths
        StudentMarks[1][2] = 89;  // Science
        
        // Marks Attained By Student 3
        StudentMarks[2][0] = 69;  // English
        StudentMarks[2][1] = 93;  // Maths
        StudentMarks[2][2] = 83;  // Science
        
        // Displaying Marks of Students
        System.out.println("Student Marks Matrix");
        System.out.println(StudentMarks[2][0]);
        
    }
}
