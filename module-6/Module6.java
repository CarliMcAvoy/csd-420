package csd420;

import java.util.*;
import java.lang.*;

/*
Program demonstrates use of bubble sorting with both the comparator and comparable interfaces.
 */

public class Module6 {

    public static void main(String[] args){

        Integer [] list = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("Initial List: ");
        display(list);
        System.out.println();

        //establish objects for use as parameters
        Comparator<Integer> comOne = (i1, i2) -> Integer.compare(i1, i2);
        Comparable<Integer> comTwo = null;

        comparatorBubbleSort(list, comOne);

        System.out.println("Sorted with comparator: ");
        display(list);

        comparableBubbleSort(list, comTwo);

        System.out.println();

        System.out.println("Sorted with comparable: ");
        display(list);
    }

    public static void comparatorBubbleSort(Integer [] array, Comparator<Integer> comparator){
        boolean needSwap = true;

        //bubble sort method
        for (int i = 1; i < array.length && needSwap; i++){
            needSwap = false;
            for (int j = 0; j < array.length - i; j++){
                //use comparator in if statement
                if (comparator.compare(array[j], array[j+1]) > 0){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    needSwap = true;
                }
            }
        }

    }

    public static <Integer extends Comparable<Integer>> void comparableBubbleSort(Integer [] array, Comparable<Integer> comparable){
        boolean needSwap = true;

        //bubble method
        for (int i = 1; i < array.length && needSwap; i++){
            needSwap = false;
            for (int j = 0; j < array.length - i; j++){
                //use comparable method compareTo in if statement
                if (array[j].compareTo(array[j+1]) > 0){
                    Integer temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    needSwap = true;
                }
            }
        }
    }

    public static void display(Integer [] array){

        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
