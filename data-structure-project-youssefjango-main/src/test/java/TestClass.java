/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Convertors.DataConvertor;
import School.Departement;
import Workers.Staff;
import Workers.Teacher;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 2248826
 */
public class TestClass {

    public TestClass() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testComputePayRollStaff() throws Exception {
        Staff testStaff = new Staff(21, "Joe Rod", true, 25.5,
                "joeRod@gmail.com", 10, 2248, "Guard");

        assertEquals(testStaff.ComputePayRoll(), 1224);
        assertEquals(testStaff.infoValidator(), true);

    }

    @Test
    public void testComputePayRollTeacher1() throws Exception {
        Teacher testTeacher = new Teacher(30, "Darwin Dormard", true, 31,
                "Dormard@gmail.com", 5, 2222, "Scientist",
                "PhD", false);
        assertEquals(false, testTeacher.infoValidator());
        assertEquals(5902.4, testTeacher.ComputePayRoll());

    }

    @Test
    public void testComputePayRollTeacher2() throws Exception {
       Teacher testTeacher = new Teacher(30, "Darwin Roland", true, 31,
                "Roland@gmail.com", 5, 2222, "Scientist",
                "PhD", true);
        assertEquals(true, testTeacher.infoValidator());
        assertEquals(5277.44, testTeacher.ComputePayRoll());
        

    }

    @Test
    public void testConvertor1() {
        String path = "Database\\TestDepartement.txt";
        Departement testDep = DataConvertor.convertToObjects(path);
        assertEquals(2246, testDep.getID());

    }

    @Test
    public void testConvertor2() {
        String path = "Database\\TestDepartement.txt";
        Departement testDep = DataConvertor.convertToObjects(path);
        assertEquals("English", testDep.getDepartementName());

    }
     @Test
    public void testConvertor3() {
        String path = "Database\\TestDepartement.txt";
        Departement testDep = DataConvertor.convertToObjects(path);
         System.out.println(testDep);
         System.out.println(testDep.getDean().getName());
        assertEquals("Vivian Felmlee", testDep.getDean().getName());

    }
}
