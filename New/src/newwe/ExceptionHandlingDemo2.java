package newwe;

public class ExceptionHandlingDemo2{
public static void divideByZero() {
    throw new ArithmeticException("Divide by Zero");
}
    public static void main(String[] args) {
        divideByZero();
    }
}
