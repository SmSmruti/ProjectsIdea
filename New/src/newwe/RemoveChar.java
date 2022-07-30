package newwe;

import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String :- ");
//        String str = sc.nextLine();
        String str = "RamarAMA";

        for(int i= 0;i<str.length();i++){
            if(str.charAt(i)!='a'){
                System.out.print(str.charAt(i));
            }
        }
    }
}
