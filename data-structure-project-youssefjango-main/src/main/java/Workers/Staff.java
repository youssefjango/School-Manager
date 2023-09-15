/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Exceptions.InfoException;

/**
 * This class defines the Staffs in the departments.
 * @author Youssef
 */
public class Staff extends Person {

    private String duty;
    private double workload;

    /**
     *
     * @param age
     * @param name
     * @param isMale
     * @param workload
     * @param email
     * @param yearsOfExp
     * @param ID
     * @param duty
     */
    public Staff(int age, String name, boolean isMale, double workload,
            String email, int yearsOfExp, int ID, String duty) {
        super(age, name, isMale, email, yearsOfExp, ID);
        this.duty = duty;
        this.workload = workload;
    }

    /**
     *
     * @return
     */
    @Override
    public double ComputePayRoll() {
        return (this.workload * 32 * 2) * 0.75;
    }

    /**
     *
<<<<<<< HEAD
     * @return
=======
     * @throws InfoException
>>>>>>> 6556a2819818616aa7779cf9f57729f6ce1766bd
     */
    @Override
    public boolean infoValidator() throws InfoException {
        return super.infoValidator() && (workload <= 40);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " " + this.duty + " " + this.workload;
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
     * @param duty
     */
    public void setDuty(String duty) {
        this.duty = duty;
    }

    /**
     *
     * @param workload
     */
    public void setWorkload(double workload) {
        this.workload = workload;
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
    public String getDuty() {
        return duty;
    }

    /**
     *
     * @return
     */
    public double getWorkload() {
        return workload;
    }

}
