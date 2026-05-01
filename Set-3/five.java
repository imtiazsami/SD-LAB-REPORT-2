import java.util.Scanner;

public class five {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int a = sm.nextInt();
        int b = sm.nextInt();
        int c = sm.nextInt();

        double avg = (a + b) / 2.0;

        if(avg > c) {
            System.out.println("Average is greater than c");
        } else {
            System.out.println("Average is not greater than c");
        }

        sm.close();
    }
}