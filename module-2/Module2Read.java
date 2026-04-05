package csd420;

import java.io.*;
import java.util.*;

/*
Program demonstrates using ObjectInputStream to read arrays stored in a .dat file.
 */

public class Module2Read {
    public static void main(String[] args) throws IOException {

    try(
            ObjectInputStream input = new ObjectInputStream(new
                    FileInputStream("mcavoydatafile.dat"))
    ){
        int[] valueOne = new int[]{input.read()};
        double[] valueTwo = new double[]{input.read()};

        for (int i = 0; i < valueOne.length; i++){
            System.out.println(valueOne[i] + " ");
        }

        for (int i = 0; i < valueTwo.length; i++){
            System.out.println(valueTwo[i] + " ");
        }

            }

        }
    }

