package cse.c251111_java2;
import java.util.Scanner;
public class C251111_java2 {


    public static void main(String[] args) {
         Scanner num = new Scanner(System.in);

        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Max = " + max);
    }
}