//WAP to accept a String and display particular character in a string and display the number count.

package newwe;

import java.util.Scanner;

public class DisplayCount {
    public static void main(String[] args) {

        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :- ");
        String s = sc.next();
        String l = s.toLowerCase();

        System.out.println("Enter a char :- ");
        char c = sc.next().charAt(0);

        for(int i = 0;i<l.length();i++){
            if(l.charAt(i)==c){
                count++;
            }
        }
        System.out.println("The no of times used :- " +count);
    }
}
