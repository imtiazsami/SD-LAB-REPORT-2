

import java.util.Scanner;

public class fourthen {


    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int P = sm.nextInt();
        int Q = sm.nextInt();
        int R = sm.nextInt();
        int S = sm.nextInt();

        if(P > sum(Q, R, S)) {
            System.out.println("Monopoly by A");
        }
        else if(Q > sum(P, R, S)) {
            System.out.println("Monopoly by B");
        }
        else if(R > sum(P, Q, S)) {
            System.out.println("Monopoly by C");
        }
        else if(S > sum(P, Q, R)) {
            System.out.println("Monopoly by D");
        }
        else {
            System.out.println("No monopoly in the market");
        }

        sm.close();
    }
}