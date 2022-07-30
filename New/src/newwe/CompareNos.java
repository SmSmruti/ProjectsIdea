package newwe;

import java.sql.SQLOutput;
import java.util.Scanner;

class Com {
    int a;
    int b;

    public void compare() {
        if (a > b) {
            System.out.println("a is greater.");
        } else if (a < b) {
            System.out.println("a is lesser");
        } else {
            System.out.println("a is equal to b");
        }
    }

}

public class CompareNos {
    public static void main(String[] args) {

        Com c = new Com();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a =");
        int a = sc.nextInt();
        System.out.println("Enter b =");
        int b = sc.nextInt();
        c.compare();
    }
}
