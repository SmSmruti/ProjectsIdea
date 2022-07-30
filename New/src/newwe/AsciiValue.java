package newwe;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        while (a <= 90) {
            char ch = (char) a;
            System.out.println(ch);
            a++;
        }

    }
}

