package newwe;

import java.util.Scanner;

public class CorrespondingDay {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter a number :- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n == 1) {
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else if (n == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Error day not found...");
        }

    }
}
