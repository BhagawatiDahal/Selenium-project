/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.test;

import com.itexps.vo.PartTimeStudent;
import com.itexps.vo.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brave
 */
public class StudentTest {
    
    Student stu;  // declare
    
    
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
       stu = new PartTimeStudent(1550.0f,true,1, 'A',"Tom"); 
        
        
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testStudent() {
        
      assertEquals("Tom",stu.getFirst());
        
  assertTrue(((PartTimeStudent) stu).isWorking());
    }
}