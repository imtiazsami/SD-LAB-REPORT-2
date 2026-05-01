

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int a = sm.nextInt();
        int b = sm.nextInt();
        int c = sm.nextInt();

        int ts = a * b;

        double per = ((double) c / ts) * 100;

        if(per > 50) {
            System.out.println("Passed students are greater than 50%");
        } else {
            System.out.println("Passed students are not greater than 50%");
        }

        sm.close();
    }
}