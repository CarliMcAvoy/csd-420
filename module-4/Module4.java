package csd420;

import java.util.*;

/*
Program demonstrates difference in time taken to traverse LinkedLists with different sizes using different
traversal methods
 */

public class Module4 {

    public static void main(String[] args) {

        LinkedList<Integer> listOne = new LinkedList<>();
        LinkedList<Integer> listTwo = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 50000; i++) {
            listOne.add(random.nextInt(10));
        }

        for (int i = 0; i < 500000; i++) {
            listTwo.add(random.nextInt(10));
        }


        //Create Iterator for each list
        Iterator<Integer> itOne = listOne.iterator();
        Iterator<Integer> itTwo = listTwo.iterator();


        //Find time in milliseconds to traverse 50,000 Integers using iteration
        long startTime = System.currentTimeMillis();
        while(itOne.hasNext()){
            Integer element = itOne.next();
        }
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time taken to traverse 50,000 integers with an Iterator: " + (endTime - startTime) + "ms");


        //Find time in milliseconds to traverse 500,000 Integers using iteration
        long startTimeTwo = System.currentTimeMillis();
        while(itTwo.hasNext()){
            Integer element = itTwo.next();
        }
        long endTimeTwo = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time taken to traverse 500,000 integers with an Iterator: " + (endTimeTwo - startTimeTwo) + "ms");


        //Find time to traverse 50,000 Integers using get(index)
        long startTimeThree = System.currentTimeMillis();
        for (int i : listOne){
            listOne.get(i);
        }
        long endTimeThree = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time taken to traverse 50,000 integers with get(index) method: " +  (endTimeThree - startTimeThree) + "ms");


        //Find time to traverse 500,000 Integers using get(index)
        long startTimeFour = System.currentTimeMillis();
        for (int i : listTwo){
            listTwo.get(i);
        }
        long endTimeFour = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time taken to traverse 500,000 integers with get(index) method: " +  (endTimeFour - startTimeFour) + "ms");

    }
}
/*
Using the iterator method to traverse each list was significantly faster than using the get(index) method. Of course,
traversing the list with 500,000 integers took longer than traversing the list with 50,000 in each instance. However,
when using the iterator method, it only took a few more milliseconds to traverse the longer list compared to the
shorter list. When using the get(index) method, it took more than twice as long to traverse the longer list compared
to the shorter list. Overall, it is apparent that using iteration is much more efficient than using get(index) for
large amounts of data.
 */
