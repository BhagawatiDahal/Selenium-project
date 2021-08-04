/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.vo;

import java.util.ArrayList;

/**
 *
 * @author brave
 */
public class College {
    
    private String name;
    ArrayList <Student> studentList;

    public College() {
    }

    public College(String name, ArrayList<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "College{" + "name=" + name + ", studentList=" + studentList + '}';
    }
    
    
    
    
    
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    
    
}
