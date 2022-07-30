package newwe;

import java.util.Arrays;

public class EvenOddFn {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int even = 0;
        int odd = 0;
        int evensum = 0;
        int oddsum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        int[] evenarr = new int[even];
        int[] oddarr = new int[odd];

        int j = 0;
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenarr[j++] = arr[i];
            } else
                oddarr[k++] = arr[i];
        }
        System.out.println("Original array :- " + Arrays.toString(arr));
        System.out.println("No of Elements in Even Array :- "+even);
        System.out.println("No of Elements in Odd Array :- "+odd);
        System.out.println("Even array :- " + Arrays.toString(evenarr));
        System.out.println("Odd Array :- " + Arrays.toString(oddarr));

        for (int i = 0; i < evenarr.length; i++) {
            evensum += arr[i];
        }
        for(int i = 0; i< oddarr.length;i++){
            oddsum+=arr[i];
        }
        System.out.println("Sum of Even Array nos :- "+evensum);
        System.out.println("Sum of Odd Array nos :- "+oddsum);

        double x = evensum/oddsum;
        System.out.println("Even Array sum / Odd Array sum :- "+ x);

    }
}