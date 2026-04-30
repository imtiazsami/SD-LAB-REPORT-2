package cse.c251111_java2;
import java.util.Scanner;
public class C251111_java2 {

    public static void main(String[] args) {
        
      Scanner obj = new Scanner(System.in);

        int num = obj.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}