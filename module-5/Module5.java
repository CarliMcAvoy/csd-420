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

    //Create file object
    File file = new File("collection_of_words.txt");

    //Call methods
    noDuplicates(treeSet, file);
    display(treeSet);

    }

    //Method for adding text from a file to a String TreeSet
    public static void noDuplicates(TreeSet<String> set, File file){

        //Add words from file to TreeSet using the Scanner method
        try (Scanner input = new Scanner(new File(file.getName()))){
            while (input.hasNext()){
                set.add(input.next());
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    //Display TreeSet method
    public static void display(TreeSet<String> set){

        for (String s : set){
            System.out.print(s + " ");
        }

        System.out.println();

        //Display TreeSet in descending order
        for (String s : set.reversed()){
            System.out.print(s + " ");
        }
    }
}
