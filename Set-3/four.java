

import java.util.Scanner;

public class four {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int a = sm.nextInt();
        int b = sm.nextInt();
        int c = sm.nextInt();

        if(a == b && b == c) {
            System.out.println("All values are same");
        }
        else {
            if(a == b) {
                System.out.println("c is different");
            }
            else if(a == c) {
                System.out.println("b is different");
            }
            else if(b == c) {
                System.out.println("a is different");
            }
            else {
                System.out.println("All values are different");
            }
        }

        sm.close();
    }
}