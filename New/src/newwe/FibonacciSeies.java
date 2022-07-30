package newwe;

public class FibonacciSeies {
    public static void main(String[] args) {

        int num1, num2;
        num1 = 1;
        num2 = 2;

        while (num2 <= 189) {
            System.out.println(num2);
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
    }
}
