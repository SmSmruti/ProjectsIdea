package newwe;

//WAP to accept 20 character and display the number of vowel and no of non vowel:-

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {

        char ch;
        int vl, nvl, i = 1;
        vl = 0;
        nvl = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element :- ");
        while (i <= 2) {
            ch=sc.next().charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                vl++;
            }
            else {
                nvl++;
            }
            i++;
        }
        System.out.println(vl);
        System.out.println(nvl);
    }
}
