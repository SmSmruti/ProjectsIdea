package newwe;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        int a, b, c;
        System.out.println("Enter 3 numbers :- ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && b > c) {
            System.out.println(a + " A is greatest number");
        }
        else if(a < b && b < c) {
            System.out.println(c + " C is greatest number");
        }else
            System.out.println("B is greatest");
    }
}
