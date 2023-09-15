/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exceptions;

/**
 * This exception class is used to be thrown whenever the user types an ID of a
 * teacher that does not exsist
 *
 * @author Youssef
 */
public class DeanException extends RuntimeException {

    /**
     * Creates a new instance of <code>DeanException</code> without detail
     * message.
     */
    public DeanException() {
    }

    /**
     * Constructs an instance of <code>DeanException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public DeanException(String msg) {
        super(msg);
    }
}
