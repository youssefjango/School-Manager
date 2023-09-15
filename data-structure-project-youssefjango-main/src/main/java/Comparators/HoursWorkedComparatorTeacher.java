/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparators;

import Workers.Teacher;
import java.util.Comparator;

/**
 * This class serves to compare the hours worked of each of the teachers(assending). This
 * is used to in the Sort class made by Youssef and Oliver.
 *
 * @author YOUSSEF
 */
public class HoursWorkedComparatorTeacher implements Comparator<Teacher> {

    /**
     *
     * @param t1
     * is teacher 1.
     * @param t2
     * is teacher 2.
     * @return
     * the difference between the two, which is greatly by the hours worked.
     */
    @Override
    public int compare(Teacher t1, Teacher t2) {
        return (int) (t1.getHoursWorked() - t2.getHoursWorked()) * 10000
                + t1.getYearsOfExp() - t2.getYearsOfExp() * 100
                + t1.getName().compareTo(t2.getName())
                + (t1.getAge() - t2.getAge());
    }

}
