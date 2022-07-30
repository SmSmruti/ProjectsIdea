package practise;

import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {

        int a, b;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        a = s.nextInt();
        System.out.println("Enter a Number : ");
        b = s.nextInt();

        for(int i = 1; i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                System.out.println("Common Divisor : " + i);

            }

        }

    }
}
