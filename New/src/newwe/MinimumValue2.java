package newwe;

public class MinimumValue2 {
    public static void main(String[] args) {

        int[] arr = {8, 4, 7, 3, 1, 6};
        int value = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < value) {
                value = arr[i];
            }
        }
        System.out.println(value);
    }
}
