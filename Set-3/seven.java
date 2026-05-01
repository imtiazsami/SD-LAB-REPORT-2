

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        int f = sm.nextInt();

        int l = f + 3;
    
        if(l <= 10) {
            System.out.println("The boy can finish");
        } else {
            System.out.println("The boy can't finish");
        }

        sm.close();
    }
}