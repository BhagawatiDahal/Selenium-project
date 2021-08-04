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
public class PartTimeStudent extends Student {
    private float fees;
    private boolean working;

    public PartTimeStudent(float fees, boolean working, int id, char grade, String first) {
        super(id, grade, first);
        this.fees = fees;
        this.working = working;
    }

   // public PartTimeStudent(float fees, boolean working) {
   //     this.fees = fees;
  //      this.working = working;
   // }

    @Override
    public String toString() {
        return "PartTimeStudent{" + "fees=" + fees + ", working=" + working + ","+super.toString()+ '}';
    }
    
    
    
    
    
    

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
    
    
}
