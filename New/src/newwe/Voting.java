package newwe;

import java.awt.datatransfer.DataFlavor;
import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {

        System.out.println("Enter your age :- ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Person is eligible for Voting.");
        } else {
            System.out.println("Person is not eligible for Voting.");
        }
    }
}

