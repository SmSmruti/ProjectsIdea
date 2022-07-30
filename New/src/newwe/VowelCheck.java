package newwe;//WAP to accept a character until '!' is not accepted then display whether number of vowel is greater or lesser to non vpwel:-

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        char ch = ' ';
        int vl, nvl, i = 1;
        vl = 0;
        nvl = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element :- ");
        while (ch != '!') {
            ch = sc.next().charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vl++;
            } else {
                nvl++;
            }
        }
        if (vl > nvl) {
            System.out.println("Vowel is greater than Non-Vowel");
        } else {
            System.out.println("Vowel is lesser than Non-Vowel");
        }
    }
}
