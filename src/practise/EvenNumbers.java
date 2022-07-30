package practise;

public class EvenNumbers {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println("Even numbers are :- " + i);
                n += 1;
            }
        }
        System.out.println("No of Even Present in :- " + n);

    }
}
