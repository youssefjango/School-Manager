/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Exceptions.InfoException;
import School.PayRoll;

/**
 * This class is used to initilize the common aspect between Teachers and
 * Staffs.
 *
 * @author Youssef
 */
public abstract class Person implements PayRoll {

    private int age;
    private String name;
    private boolean isMale;
    private String email;
    private int yearsOfExp;
    private int ID;

    /**
     *
     * @param age
     * @param name
     * @param isMale
     * @param email
     * @param yearsOfExp
     * @param ID
     */
    public Person(int age, String name, boolean isMale, String email, int yearsOfExp, int ID) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
        this.email = email;
        this.yearsOfExp = yearsOfExp;
        this.ID = ID;
    }

    /**
     *
     */
    public Person() {

    }

    /**
     * @throws InfoException
     * @return
     */
    public boolean infoValidator() throws InfoException {
        if (this.age < 18 || this.age > 105) {
            System.out.println("Invalid age");
            return false;
        }
        if (this.age - this.yearsOfExp < 0) {
            System.out.println("Invalid years of experience");
            return false;
        }
        if ((!this.email.contains("@") || this.email.lastIndexOf(".") - this.email.indexOf("@") < 0)) {
            System.out.println("Invalid email");
            return false;
        }

        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return name + " " + (isMale ? "M" : "F") + " " + email + " " + age + " " + yearsOfExp + " " + ID;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param isMale
     */
    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param yearsOfExp
     */
    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
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
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public boolean getIsMale() {
        return isMale;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public int getYearsOfExp() {
        return yearsOfExp;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return ID;
    }

}
