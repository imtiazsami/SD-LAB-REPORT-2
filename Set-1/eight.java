package cse.c251111_java2;
import java.util.Scanner;
public class C251111_java2 {

  public static void main(String[] args) {
        Scanner fac = new Scanner(System.in);

        int n = fac.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}