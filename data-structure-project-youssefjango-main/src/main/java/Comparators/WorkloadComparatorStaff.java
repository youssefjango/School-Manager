/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparators;

import Workers.Staff;
import java.util.Comparator;

/**
 * This class serves to compare the wordload of each of the Staff(assending). This
 * is used to in the Sort class made by Youssef and Oliver.
 *
 * @author YOUSSEF
 */
public class WorkloadComparatorStaff implements Comparator<Staff> {

    /**
     *
     * @param s1
     * is staff 1.
     * @param s2
     * is staff 2.
     * @return
     */
    @Override
    public int compare(Staff s1, Staff s2) {
        return (int) (s1.getWorkload() - s2.getWorkload()) * 10000
                + s1.getYearsOfExp() - s2.getYearsOfExp() * 100
                + s1.getName().compareTo(s2.getName())
                + (s1.getAge() - s2.getAge());
    }

}
