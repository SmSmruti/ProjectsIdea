package newwe;

import java.util.Arrays;

public class MinimumValue {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 8, 7, 2, 4, 1};
        Arrays.sort(arr);
        System.out.println("The Minimum Value in the Array :- " + arr[0]);
    }
}
