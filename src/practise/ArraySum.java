package practise;

import org.w3c.dom.ls.LSOutput;

public class ArraySum {
    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 7, 6, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] + arr[j] == 12) {
                    System.out.println(arr[i] + "," + arr[j]);

                }
//                else {
//                    System.out.println("no elements");
//                }

            }
        }
    }
}
