package newwe;

import java.util.Scanner;

public class VowelCheckDemo {
    public static void main(String[] args) {

        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word :- ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'A') || (str.charAt(i) == 'e') || (str.charAt(i) == 'E') || (str.charAt(i) == 'i') ||
                    (str.charAt(i) == 'I') || (str.charAt(i) == 'o') || (str.charAt(i) == 'O') || (str.charAt(i) == 'U') || (str.charAt(i) == 'u')) {
                count++;
                System.out.println(str.indexOf(str.charAt(i)));

            } else
                System.out.println("Sorry No Vowel.");

        }
    }
}
