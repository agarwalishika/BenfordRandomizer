package com.company;

public class BenfordRandomizer {

    //Generates a random number from 0 to 1
    public static double generate() {
        int ran = randomDigit();
        double num = Math.random();

        while (findFirstDig(num) != ran) {
            num = Math.random();
        }

        return num;
    }

    //Extracts the first digit of a double
    private static int findFirstDig(double num) {
        String numS = ("" + num);
        for (int i = 0; i < numS.length(); i++) {
            if ("0.".indexOf(numS.charAt(i)) == -1) {
                return Integer.parseInt("" + numS.charAt(i));
            }
        }

        return 0;
    }

    //Generates a random digit that abides to
    //Benford's law calculations
    private static int randomDigit() {
        int n = (int)(Math.random() * 100 + 1);

        if (n <= 30) {
            return 1;
        } else if (n <= 47) {
            return 2;
        } else if(n <= 60) {
            return 3;
        } else if (n <= 70) {
            return 4;
        } else if (n <= 78) {
            return 5;
        } else if (n <= 85) {
            return 6;
        } else if (n <= 90) {
            return 7;
        } else if (n <= 95) {
            return 8;
        } else {
            return 9;
        }
    }
}
