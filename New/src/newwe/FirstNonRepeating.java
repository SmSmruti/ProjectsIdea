package newwe;

public class FirstNonRepeating {
    public static void main(String[] args) {

        String str = "lollipop";
        System.out.println("The String is :- " + str);

        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
        }
    }
}
