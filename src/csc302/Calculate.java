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
public class Calculate {
    private final double yourCgpa;
    
    public double getGpa(){
        return this.yourCgpa;
    }
    public Calculate(ArrayList<Semester> semesters){
        double totalGps = 0;
        for(int i = 0; i < semesters.size(); i++){
            totalGps += semesters.get(i).calcGp();
        }
        double cgpa;
                
        cgpa = totalGps/(double)semesters.size();  
        this.yourCgpa  = cgpa;
    }
}
