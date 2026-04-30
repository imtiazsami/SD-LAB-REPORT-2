package cse.c251111_java2;
import java.util.Scanner;
public class C251111_java2 {

   public static void main(String[] args) {
       int s[] = {89, 20, 18, 40};
        int target = 18;
        boolean found = false;

        for (int i=0; i<4; i++) {
            if (s[i] == target) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Targeted Number " + target + " Found" : "Targeted Number Not Found");
    }
}