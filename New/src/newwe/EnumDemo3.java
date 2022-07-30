package newwe;

enum Weekdays {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Weekdays w= Weekdays.Friday;

        if (w == Weekdays.Sunday || w == Weekdays.Saturday) {
            System.out.println(w + " It's Weekend..");
        } else {
            System.out.println(w + " It's Weekday..");
        }

        Weekdays[] ws = Weekdays.values();
        for(Weekdays x:ws){
            System.out.println(x);
        }

    }
}
