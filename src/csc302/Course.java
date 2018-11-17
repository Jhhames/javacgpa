/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc302;

/**
 *
 * @author Jhhames
 */

import java.util.Scanner;

public final class Course {
    private int courseUnit; 
    private String courseTitle;
    private String courseCode;
    private int score;
    private int grade;
    
    
    public void setScore(int score){
        this.score = score;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void setCourseUnit(int unit){
        this.courseUnit = unit;
    }
    
    public int getCourseUnit(){
        return this.courseUnit;
    } 
    
    public void setCourseTitle(String title){
        this.courseTitle = title;
    }
    
    public String getCourseTitle(){
        return this.courseTitle; 
    }
    
    public void setCourseCode(String code){
        this.courseCode = code;
    }
    
    public String getCourseCode(){
        return this.courseCode;
    }
    
    public void setGrade(int score){
        if(score >= 70){
            this.grade = 5;
        }else if(score <70 && score>= 60){
            this.grade = 4;
        }else if(score < 60 && score >= 50){
            this.grade = 3;
        }else if(score < 50 && score >= 45 ){
            this.grade = 2; 
        }else if(score < 45 && score >= 40){
            this.grade = 1;
        }else if(score < 40){
            this.grade = 0;
        }else{
            this.grade = 0;
        }
    }
    
    public int getGrade(){
        return this.grade;
    }
    
    public int calcGradePoint(){
        return this.grade * this.courseUnit;
    }
        
    
    
    /**
     *  Class constructor 
     * @param code
     */
    public Course(String code){
        this.courseCode = code;
        System.out.println("Enter score in " + code);
        Scanner scan = new Scanner(System.in);
        
        int entered = scan.nextInt();
        this.score = entered;
        this.setGrade(entered);
   
        System.out.println("Enter "+ code + " unit");

        int unitEntered = scan.nextInt();     
        this.courseUnit = unitEntered;
         
     }
            
}
