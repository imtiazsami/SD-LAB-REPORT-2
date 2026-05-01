import java.util.Scanner;

public class one
 {
    public static void main(String[] args) {

        System.out.println("Set-03: Problem One");

        Scanner sm = new Scanner(System.in);

        int A = sm.nextInt();
        int C = sm.nextInt();

        int sum = A + C;

        if (sum % 2 == 0) {
            int B = sum / 2;
            System.out.println("B = " + B);
        } else {
            System.out.println("B does not exist");
        }

        sm.close();
    }
}