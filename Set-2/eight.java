package cse.c251111_java2;
import java.util.Scanner;
public class C251111_java2 {

   public static void main(String[] args) {
       Scanner palndrm = new Scanner(System.in);
        String s = palndrm.nextLine();
        
        int i = 0;
        int j = s.length() - 1;
        boolean isPal = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPal = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPal ? "Palindrome" : "Not Palindrome");
    }
}