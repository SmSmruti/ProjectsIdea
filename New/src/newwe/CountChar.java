package newwe;

public class CountChar {
    public static void main(String[] args) {
        int r = 0;
        int m = 0;
        int a = 0;
        String str = "RAMArama";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'A') || (str.charAt(i) == 'a')) {
                a++;
            } else if ((str.charAt(i) == 'R') || (str.charAt(i) == 'r')) {
                r++;
            } else if ((str.charAt(i) == 'M') || (str.charAt(i) == 'm')) {
                m++;

            }
        }
        System.out.println("No of times 'a' Repeated :- " + a);
        System.out.println("No of times 'r' Repeated :- " + r);
        System.out.println("No of times 'm' Repeated :- " + m);
    }
}
