

import java.util.Scanner;

public class fiftheen {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int A = sm.nextInt();
        int B = sm.nextInt();
        int C = sm.nextInt();

        int hMR = Math.max(A, C);

        if(hMR <= B) {
            System.out.println("Agree on some temperatures");
        } else {
            System.out.println("Can't agree on some temperatures");
        }

        sm.close();
    }
}