package cse.c251111_java2;
import java.util.Scanner;
public class C251111_java2 {

  
        
   public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);

        int n = multi.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}