

import java.util.Scanner;

public class thirthen {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int A = sm.nextInt();
        int B = sm.nextInt();
        int C = sm.nextInt();
        int x = sm.nextInt();

        if(x == A || x == B || x == C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sm.close();
    }
}