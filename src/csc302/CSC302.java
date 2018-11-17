/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc302;

import java.util.ArrayList;

/**
 *
 * @author Jhhames
 */
public class CSC302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Course> firstSemCourses = new ArrayList();
        firstSemCourses.add(new Course("MTH101"));
        firstSemCourses.add(new Course("CHM101"));
        firstSemCourses.add(new Course("PHY101")); 
        firstSemCourses.add(new Course("CSC101"));
        firstSemCourses.add(new Course("PHY107"));
        firstSemCourses.add(new Course("CHM103"));
        firstSemCourses.add(new Course("TPD101"));
        Semester firstSemesterPart1 = new Semester(firstSemCourses);
        System.out.println("Your GP for part 1 first semester is " + firstSemesterPart1.calcGp());
        
        ArrayList<Course> secondSemCourses = new ArrayList();
        secondSemCourses.add(new Course("MTH102"));
        secondSemCourses.add(new Course("PHY102"));
        secondSemCourses.add(new Course("MTH104"));
        secondSemCourses.add(new Course("CHM102"));
        secondSemCourses.add(new Course("PHY108"));
        secondSemCourses.add(new Course("CHM102"));
        secondSemCourses.add(new Course("CSC102"));
        secondSemCourses.add(new Course("CHM104"));
        Semester secondSemesterPart1 = new Semester(secondSemCourses);
        System.out.println("Your GP for part 1 second semester is " + secondSemesterPart1.calcGp());
                
        
        ArrayList<Semester> allSemesters = new ArrayList();
        allSemesters.add(firstSemesterPart1);
        allSemesters.add(secondSemesterPart1);
        
        
        Calculate total = new Calculate(allSemesters);
        
        System.out.println("Your Cgpa is " + total.getGpa());
    
}
    
    

}
    
