/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exceptions;

/**
 * This exception class is used to be thrown whenever the user types an ID of a
 * teacher/staff is similar to another in the same or in an other departement.
 *
 * @author Youssef
 */
public class IDInSameSchoolException extends RuntimeException {

    /**
     * Creates a new instance of <code>IDInSameSchoolException</code> without
     * detail message.
     */
    public IDInSameSchoolException() {
    }

    /**
     * Constructs an instance of <code>IDInSameSchoolException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IDInSameSchoolException(String msg) {
        super(msg);
    }
}
