package cse.c251111_java2;
import java.util.Scanner;
public class C251111_java2 {

    public static void main(String[] args) {
        
        Scanner cal = new Scanner(System.in);

        int a = cal.nextInt();
        int b = cal.nextInt();
        char oprtr = cal.next().charAt(0);

        if (oprtr == '+') {
            System.out.println(a + b);
        } else if (oprtr == '-') {
            System.out.println(a - b);
        } else if (oprtr == '*') {
            System.out.println(a * b);
        } else if (oprtr == '/') {
            System.out.println(a / b);
        } else {
            System.out.println("Invalid operator");
        }
    }
}