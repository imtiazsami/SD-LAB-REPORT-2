import java.util.Scanner;

class two {   

    public static void main(String[] args) {

        System.out.println("Set-02: Problem Two");

        Scanner sm = new Scanner(System.in);

        String str = sm.nextLine().trim();

        if (str.length() > 10) {

            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);

            int middleCount = str.length() - 2;

            System.out.println("" + first + middleCount + last);

        } else {
            System.out.println(str);
        }

        sm.close();
    }
}