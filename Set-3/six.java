package cse.c251111_java2;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int x = sm.nextInt();
        int y = sm.nextInt();

        double subs = (double) x / 6;

        long totalSubs = (long) Math.ceil(subs);

        long totalCost = totalSubs * y;

        System.out.println("Total Subscription Cost = " + totalCost);

        sm.close();
    }
}