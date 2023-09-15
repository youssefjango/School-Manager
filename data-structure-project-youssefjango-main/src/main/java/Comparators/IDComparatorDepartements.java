/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparators;

import School.Departement;
import java.util.Comparator;

/**
 *
 * @author YOUSSEF
 */
public class IDComparatorDepartements implements Comparator<Departement> {

    @Override
    public int compare(Departement d1, Departement d2) {
        return (d1.getID() - d2.getID())
                /*+ d1.getDepartementName().replace('_', ' ').compareTo(d2.getDepartementName().replace('_', ' '))
                + (d1.getNumberOfStudent() - d2.getNumberOfStudent())*/;
    }

}
