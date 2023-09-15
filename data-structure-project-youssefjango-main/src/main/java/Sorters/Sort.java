/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorters;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.ListIterator;

/**
 * This sort class is used to sort a particular ArrayList of type T, according
 * to a specific comparator.
 *
 * @author Youssef
 *
 * @param <T> the type T indicates any types of Arrays and any type of
 * comparator.
 */
public class Sort<T> extends MergeSort {

    /**
     *
     * @param personsOrDep
     * @param comparator
     */
    public void sort(ArrayList<T> personsOrDep, Comparator<T> comparator) {
        Object[] arrayOfPersonsOrDeps = personsOrDep.toArray();
        Object[] auxiliary = arrayOfPersonsOrDeps.clone();
        MergeSort.mergeSort(auxiliary, arrayOfPersonsOrDeps, 0, arrayOfPersonsOrDeps.length, 0, comparator);
        System.out.println(personsOrDep);
        ListIterator<T> iterator = personsOrDep.listIterator();
        for (Object personOrDeps : arrayOfPersonsOrDeps) {
            System.out.println(personOrDeps);
            iterator.next();
            iterator.set((T) personOrDeps);
        }
    }
}