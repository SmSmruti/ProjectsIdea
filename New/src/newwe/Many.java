package newwe;

import java.util.Scanner;

public class Many {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence :- ");
        String str = sc.nextLine();
        int digits = 0;

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (Character.isDigit(x)){
                digits++;}

        }
        System.out.println("Total number of Digits :- " + digits);
    }
}
