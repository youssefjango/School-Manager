/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School;

import Workers.Dean;
import Workers.Staff;
import Workers.Teacher;
import java.util.ArrayList;

/**
 * This class stores all the teachers, the staffs and other critical information
 * in a specific department.
 *
 * @author Youssef
 */
public class Departement {

    private ArrayList<Teacher> teachers;
    private ArrayList<Staff> staffs;
    private int numberOfStudent;
    private Dean dean;
    private int ID;
    private String departementName;

    /**
     *
     * @param teachers
     * @param staffs
     * @param numberOfStudent
     * @param dean
     * @param ID
     * @param departementName
     */
    public Departement(ArrayList<Teacher> teachers, ArrayList<Staff> staffs,
            int numberOfStudent, Dean dean, int ID, String departementName) {
        this.teachers = teachers;
        this.staffs = staffs;
        this.numberOfStudent = numberOfStudent;
        this.dean = dean;
        this.ID = ID;
        this.departementName = departementName;
    }

    /**
     *
     * @param ID
     * @param departementName
     * @param numberOfStudent
     */
    public Departement(int ID, String departementName, int numberOfStudent) {
        this.ID = ID;
        this.departementName = departementName;
        this.numberOfStudent = numberOfStudent;
    }

    /**
     *
     * @return
     */
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *
     * @return
     */
    public ArrayList<Staff> getStaffs() {
        return staffs;
    }

    /**
     *
     * @return
     */
    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    /**
     *
     * @return
     */
    public Dean getDean() {
        return dean;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @return
     */
    public String getDepartementName() {
        return departementName;
    }

    /**
     *
     * @param teachers
     */
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    /**
     *
     * @param staffs
     */
    public void setStaffs(ArrayList<Staff> staffs) {
        this.staffs = staffs;
    }

    /**
     *
     * @param numberOfStudent
     */
    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    /**
     *
     * @param dean
     */
    public void setDean(Dean dean) {
        this.dean = dean;
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @param departementName
     */
    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Departement{" + "teachers=" + teachers + ", staffs=" + staffs + ", numberOfStudent=" + numberOfStudent + ", dean=" + dean + ", ID=" + ID + ", departementName=" + departementName + '}';
    }

}
