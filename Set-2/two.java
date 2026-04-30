package cse.c251111_java2;
import java.util.Scanner;
public class C251111_java2 {

   public static void main(String[] args) {
       int m[] = {88,74,30,67,89};
        int max = m[0];

        for (int i = 1; i < 5; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }

        System.out.println("Largest: " + max);
    }
}