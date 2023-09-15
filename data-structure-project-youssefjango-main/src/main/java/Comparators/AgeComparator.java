/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparators;

import Workers.Person;

import java.util.Comparator;

/**
 * This class serves to compare the ages of each of the person(assending). This is
 * used to in the Sort class made by Youssef and Oliver.
 *
 * @author YOUSSEF
 */
public class AgeComparator implements Comparator<Person> {

    /**
     *
     * @param p1
     * is person 1.
     * @param p2
     * is person 2.
     * @return
     * the difference between the two, which is greatly by the age.
     */
    @Override
    public int compare(Person p1, Person p2) {
        return (p1.getAge() - p2.getAge()) * 10000
                + p1.getYearsOfExp() - p2.getYearsOfExp() * 100
                + p1.getName().compareTo(p2.getName());
    }

}
