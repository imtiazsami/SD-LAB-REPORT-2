

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int B1 = sm.nextInt();
        int B2 = sm.nextInt();
        int B3 = sm.nextInt();

        if(B1 + B2 == 0 || B1 + B3 == 0 || B2 + B3 == 0) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not water filling time");
        }

        sm.close();
    }
}