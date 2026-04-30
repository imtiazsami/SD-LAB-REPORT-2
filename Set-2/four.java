package cse.c251111_java2;
import java.util.Scanner;
public class C251111_java2 {

   public static void main(String[] args) {
       int arr[] = {15,25,35,45,55,65};
        int sum = 0;

        for (int i=0; i<6; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / 6;
        System.out.println("Average: " + avg);
    }
}