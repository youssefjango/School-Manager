/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Exceptions.InfoException;

/**
 * This class defines the teachers in the departments.
 *
 * @author Youssef
 */
public class Teacher extends Person {

    private double hoursWorked;
    private String specialty;
    private String degree;
    private boolean isPart_Time;

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
     */
    public Teacher(int age, String name, boolean isMale, double hoursWorked,
            String email, int yearsOfExp, int ID, String specialty,
            String degree, boolean isPart_Time) {

        super(age, name, isMale, email, yearsOfExp, ID);
        this.specialty = specialty;
        this.degree = degree;
        this.isPart_Time = isPart_Time;
        this.hoursWorked = hoursWorked;
    }

    /**
     *
     *
     * @return
     */
    @Override
    public double ComputePayRoll() {
        try {
            if (isPart_Time) {
                return Double.parseDouble(String.format("%.2f", (hoursWorked * degreeRate() * 2) * 0.76).replace(",", "."));
            }
            return Double.parseDouble(String.format("%.2f", (hoursWorked * degreeRate() * 2) * 0.85).replace(",", "."));
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    /**
     *
     * @return
     */
    private double degreeRate() throws Exception {
        if (this.degree.toLowerCase().equals("phd")) {
            return 112;
        }
        if (this.degree.toLowerCase().equals("master") || this.degree.equals("master's")) {
            return 82;
        }
        if (this.degree.toLowerCase().equals("bachelor")) {
            return 42;
        } else {
            throw new Exception("ALERT: No valid degree");
        }

    }

    /**
     *
     * @return @throws InfoException
     */
    @Override
    public boolean infoValidator() throws InfoException {
        return super.infoValidator() && ((isPart_Time) ? 32 > hoursWorked : 32 <= hoursWorked);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " " + degree + " " + hoursWorked + " " + specialty + " " + (isPart_Time ? "PartT" : "fullTime");
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
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
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
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     *
     * @param degree
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     *
     * @param isPart_Time
     */
    public void setIsPart_Time(boolean isPart_Time) {
        this.isPart_Time = isPart_Time;
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
    public double getHoursWorked() {
        return this.hoursWorked;
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
    public String getSpecialty() {
        return specialty;
    }

    /**
     *
     * @return
     */
    public String getDegree() {
        return degree;
    }

    /**
     *
     * @return
     */
    public boolean getIsPart_Time() {
        return isPart_Time;
    }

}
