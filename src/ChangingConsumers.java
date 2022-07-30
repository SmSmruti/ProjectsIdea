import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChangingConsumers {
    public static void main(String[] args) {

        List<String> ls = Arrays.asList("Sachin", "Satya", "Sarita");

        Consumer<String> convertToUpperCase = name ->
                System.out.println(name.toUpperCase());
        Consumer<String> append121 = name -> System.out.println(name.concat("121"));
        Consumer<String> printName = name -> System.out.println(name);
        Consumer<String> printSeperator = name -> System.out.println("\n---------------------------");

        ls.forEach(printName.andThen(convertToUpperCase).andThen(append121).andThen(printSeperator));

    }
}
