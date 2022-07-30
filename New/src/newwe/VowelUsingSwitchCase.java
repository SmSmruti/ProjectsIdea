package newwe;

import java.util.Scanner;

public class VowelUsingSwitchCase {
    public static void main(String[] args) {

        char ch;
        System.out.println("Enter a character :- ");
        Scanner sc =new Scanner(System.in);
        ch = sc.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Ït is a  Vowel.");
           break;
            default:
                System.out.println("It is not a Vowel.");
                break;
        }
    }
}
