/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itexps.vo.College;
import com.itexps.vo.PartTimeStudent;
import com.itexps.vo.Student;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sheya
 */
public class CollegeTest {

    College college;

    public CollegeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        college = new College();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCollege() {

        ArrayList<Student> stuList = new ArrayList<Student>();
        Student s1 = new PartTimeStudent(1500.0f, true, 1, 'A', "Tom");
        Student s2 = new PartTimeStudent(1500.0f, false, 2, 'A', "Mike");
        Student s3 = new PartTimeStudent(1500.0f, true, 3, 'A', "Amy");
        Student s4 = new PartTimeStudent(1500.0f, false, 4, 'A', "ulm");

        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        stuList.add(s4);

        college.setName("ABC");
        college.setStudentList(stuList);

        assertEquals("ABC", college.getName());

        assertTrue(college.getStudentList().size() == 4);

    }
}

