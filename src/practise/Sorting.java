package practise;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 2, 9, 6, 4, 1};
        Arrays.stream(arr).sorted();
        System.out.println(arr);
    }
}



