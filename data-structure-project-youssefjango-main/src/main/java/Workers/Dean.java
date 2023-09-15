/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Exceptions.InfoException;

/**
 * This class is used to set a different type of teacher, who is the responsible
 * of the departement. There must only be one in each of the departments.
 *
 * @author Youssef
 */
public class Dean extends Teacher {

    private int yearsOfDeanExp;

    /**
     *
     * @param age
     * @param name
     * @param isMale
     * @param hoursWorked
     * @param email
     * @param yearsOfExp
     * @param ID
     * @param specialty
     * @param degree
     * @param isPart_Time
     * @param yearsOfDeanExp
     */
    public Dean(int age, String name, boolean isMale, double hoursWorked,
            String email, int yearsOfExp, int ID, String specialty,
            String degree, boolean isPart_Time, int yearsOfDeanExp) {
        super(age, name, isMale, hoursWorked, email,
                yearsOfExp, ID, specialty, degree, isPart_Time);
        this.yearsOfDeanExp = yearsOfDeanExp;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " " + this.yearsOfDeanExp;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean infoValidator() throws InfoException {
        return super.infoValidator();
    }

    /**
     *
     * @param age
     */
    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    /**
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    /**
     *
     * @param isMale
     */
    @Override
    public void setIsMale(boolean isMale) {
        super.setIsMale(isMale);
    }

    /**
     *
     * @param hoursWorked
     */
    @Override
    public void setHoursWorked(double hoursWorked) {
        super.setHoursWorked(hoursWorked);
    }

    /**
     *
     * @param email
     */
    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    /**
     *
     * @param yearsOfExp
     */
    @Override
    public void setYearsOfExp(int yearsOfExp) {
        super.setYearsOfExp(yearsOfExp);
    }

    /**
     *
     * @param ID
     */
    @Override
    public void setID(int ID) {
        super.setID(ID);
    }

    /**
     *
     * @param specialty
     */
    @Override
    public void setSpecialty(String specialty) {
        super.setSpecialty(specialty);
    }

    /**
     *
     * @param degree
     */
    @Override
    public void setDegree(String degree) {
        super.setDegree(degree);
    }

    /**
     *
     * @param isPart_Time
     */
    @Override
    public void setIsPart_Time(boolean isPart_Time) {
        super.setIsPart_Time(isPart_Time);
    }

    /**
     *
     * @return
     */
    @Override
    public int getAge() {
        return super.getAge();
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getIsMale() {
        return super.getIsMale();
    }

    /**
     *
     * @return
     */
    @Override
    public double getHoursWorked() {
        return super.getHoursWorked();
    }

    /**
     *
     * @return
     */
    @Override
    public String getEmail() {
        return super.getEmail();
    }

    /**
     *
     * @return
     */
    @Override
    public int getYearsOfExp() {
        return super.getYearsOfExp();
    }

    /**
     *
     * @return
     */
    @Override
    public int getID() {
        return super.getID();
    }

    /**
     *
     * @return
     */
    @Override
    public String getSpecialty() {
        return super.getSpecialty();
    }

    /**
     *
     * @return
     */
    @Override
    public String getDegree() {
        return super.getDegree();
    }

    /**
     *
     * @return
     */
    @Override
    public boolean getIsPart_Time() {
        return super.getIsPart_Time();
    }

    /**
     *
     * @return
     */
    public int getYearsOfDeanExp() {
        return yearsOfDeanExp;
    }

    /**
     *
     * @param yearsOfDeanExp
     */
    public void setYearsOfDeanExp(int yearsOfDeanExp) {
        this.yearsOfDeanExp = yearsOfDeanExp;
    }

}
