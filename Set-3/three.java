

import java.util.Scanner;

public class three
 {
    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        String word = sm.next();

        if (word.length() > 0) {
            char first = word.charAt(0);
            char upperFirst = Character.toUpperCase(first);

            String remaining = word.substring(1);

            System.out.println(upperFirst + remaining);
        }

        sm.close();
    }
}