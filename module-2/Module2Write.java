package csd420;

import java.io.*;
import java.util.Random;

/*
Program demonstrates creating and appending to a .dat file using ObjectOutputStream and serialization to
handle arrays.
 */

public class Module2Write implements Serializable{
    public static void main(String[] args) throws IOException {

        int[] arrayOne = new int[5];
        double[] arrayTwo = new double[5];
        Random rand = new Random();

        for (int i = 0; i < arrayOne.length; i++){
            arrayOne[i] = rand.nextInt(99);
        }

        for (int i = 0; i < arrayTwo.length; i++){
            arrayTwo[i] = rand.nextInt(99);
        }

        try (
               ObjectOutputStream output = new ObjectOutputStream (new
                       FileOutputStream("mcavoydatafile.dat", true)))
        {
            output.writeObject(arrayOne);
            output.writeObject(arrayTwo);
            output.close();
        }

    }
    }
