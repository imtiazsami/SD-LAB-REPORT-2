

import java.util.Scanner;

public class nine {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int x = sm.nextInt();
        int y = sm.nextInt();

        int th = (x * 4) + y;

        System.out.println("Total hours per week = " + th);

        sm.close();
    }
}