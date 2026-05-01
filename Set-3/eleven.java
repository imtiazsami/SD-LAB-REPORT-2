

import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int x = sm.nextInt();

        int totalPulp = x * 1000;

        double notebooks = totalPulp / 100.0;

        int result = (int) Math.floor(notebooks);

        System.out.println("Notebooks = " + result);

        sm.close();
    }
}