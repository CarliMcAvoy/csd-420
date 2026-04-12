package csd420;

import java.util.*;

/*
Program demonstrates use of generics class ArrayList with a generic method to remove duplicates
 */

public class Module3 {

    public static void main(String[] args){

        ArrayList<Integer> originalList = new ArrayList<>();
        Random random = new Random();

        //Add 50 random values with a bound of 1-20
        for (int i = 0; i < 50; i++){
            originalList.add(random.nextInt(20)+1);
        }

        System.out.println("Original List: ");

        //Display list
        for (Integer i : originalList){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("New List: ");

        removeDuplicates(originalList);
    }

    //Implement generic method with ArrayList parameter
    public static <E> void removeDuplicates(ArrayList<E> list){

        ArrayList<E> newList = new ArrayList<>();

        //Add elements from parameter ArrayList to the new ArrayList, only if that element has not already been added
        for (E element : list){
            if (!newList.contains(element)){
                newList.add(element);
            }
        }

        //Display list
        for (E element : newList){
            System.out.print(element + " ");
        }
    }
}
