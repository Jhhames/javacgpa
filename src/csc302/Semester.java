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
public class Semester {
    ArrayList<Course> courses;
    
    public double calcGp(){
        int totalUnit = 0;
        int points = 0;
        for(int i = 0 ; i < this.courses.size(); i ++){    
            totalUnit += this.courses.get(i).getCourseUnit();
            points +=  this.courses.get(i).calcGradePoint();
        }
        double gpa;
        gpa = (double)points / (double)totalUnit;
        return gpa;
    }
    
    
    public Semester(ArrayList courses) {
        this.courses = courses;
    }
}
