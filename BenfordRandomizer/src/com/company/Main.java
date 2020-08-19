package com.company;

/*
    This is a random number generator based on Benford's law.

    Benford's law states that there are more numbers in nature
    that have the first digit as 1, or 2. To be exact, 30% of numbers
    have a leading digit of 1 and 17% have a leading digit of 2. They
    gradually decrease from there.

    If you take the population numbers of all countries in the world,
    extract the first digit and graph them on a frequency graph, you
    will see the Benford curve.
 */
public class Main {
    public static void main(String[] args) {
        int[] freq = new int[9];

        //Number of tests to execute
        int N = 100000;

        //Execute the tests
        for (int i = 0; i < N; i++) {
            //Generate a random number from 1 to N
            int num = (int)(BenfordRandomizer.generate() * N) + 1;

            //Extract the first digit from that number
            int dig = Integer.parseInt("" + ("" + num).charAt(0));

            //Add it to the frequency count
            freq[dig - 1]++;
        }

        //Display the results of the test
        for(int i = 0; i < freq.length; i++){
            System.out.println((i + 1) + ": " + (freq[i] / (double)N));
        }
    }
}
