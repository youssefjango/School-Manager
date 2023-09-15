/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package School;

/**
 * This is the interface that must be used to compute the salary of each of the
 * staffs and teachers.
 *
 * @author Youssef
 */
public interface PayRoll {

    /**
     *
     * @return the salary of the class to be implemented. following the rules
     * assigned by the school
     * @throws Exception
     */
    public double ComputePayRoll() throws Exception;
}
