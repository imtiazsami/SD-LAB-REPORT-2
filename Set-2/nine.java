package cse.c251111_java2;
import java.util.Scanner;
public class C251111_java2 {

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String str = in.nextLine();   
       str = str.toLowerCase();

       int vowels = 0;  
       int consonants = 0;

       for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);

           if (ch >= 'a' && ch <= 'z') { 
               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                   vowels++;
               } else {
                   consonants++;
               }
           }
       }
       System.out.println("vowels = " + vowels);
       System.out.println("consonants = " + consonants);
   }
}