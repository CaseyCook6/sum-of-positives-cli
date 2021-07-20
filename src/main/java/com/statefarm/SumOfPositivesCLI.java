package com.statefarm;

public class SumOfPositivesCLI {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            int currentValue = Integer.valueOf(args[i]);
            if (currentValue >= 0) {
                sum += currentValue;
            }
        }
        System.out.println(sum);

    }
}
