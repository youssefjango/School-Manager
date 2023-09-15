/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exceptions;

/**
 * This exception class is used to be thrown whenever the user the information
 * entered does not fit in the Infovalidator or any other implemented conditions.
 *
 * @author Youssef
 */
public class InfoException extends RuntimeException {

    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public InfoException() {
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public InfoException(String msg) {
        super(msg);
    }
}
