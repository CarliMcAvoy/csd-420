package csd420;

import java.util.*;

public class CarliThreeThreads extends Thread{

    public static void main(String[] args) {

        Random random = new Random();

        Thread t1 = new Thread(() -> {
            String pool = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i <= 10000; i++) {
                char nextChar = pool.charAt(random.nextInt(pool.length()));
                System.out.print(nextChar);
            }
        });
        t1.start();


        Thread t2 = new Thread(() -> {
            int nextDigit = random.nextInt(10);
            for (int i = 1; i <= 10000; i++) {
                System.out.print(nextDigit);
            }
        });
        t2.start();


        Thread t3 = new Thread(() -> {
            String charPool = "!@#$%^&*<>?";
            for (int i = 1; i <= 10000; i++) {
                char nextChar = charPool.charAt(random.nextInt(charPool.length()));
                System.out.print(nextChar);
            }
        });
        t3.start();


    }

}
