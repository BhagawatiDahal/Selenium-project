/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.vo;

/**
 *
 * @author brave
 */
public class Student {
    private int id;
    private char grade;
    private String first;

    public Student(int id, char grade, String first) {
        this.id = id;
        this.grade = grade;
        this.first = first;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", grade=" + grade + ", first=" + first + '}';
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }
    
}
