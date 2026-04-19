package csd420;

import java.io.*;
import java.util.*;

/*
Program demonstrates assigning text from a file to a TreeSet to eliminate duplicates and display in ascending and
descending order.
 */

public class Module5 {
    public static void main(String[] args){

    //create TreeSet
    TreeSet<String> treeSet = new TreeSet<>();

    //Add words from file to TreeSet using the Scanner method
    try (Scanner input = new Scanner(new File("collection_of_words.txt"))) {
        while (input.hasNext()) {
            treeSet.add(input.next());
        }
    } catch (Exception e){
        e.printStackTrace();
    }

    //Display TreeSet
    for (String s : treeSet){
        System.out.print(s + " ");
    }

    System.out.println();

    //Display TreeSet in descending order
    for (String s : treeSet.reversed()){
        System.out.print(s + " ");
    }
    }
}
