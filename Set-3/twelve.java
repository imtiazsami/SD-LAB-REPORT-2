

import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int a = sm.nextInt();
        int x = sm.nextInt();

        int mn = (4 * a) - x;

        int tptb = 0;

        if(mn > 0) {
            tptb = (int) Math.ceil(mn / 4.0);
            System.out.println("Packets needed = " + tptb);
        } else {
            System.out.println("No more packets are needed");
        }

        sm.close();
    }
}