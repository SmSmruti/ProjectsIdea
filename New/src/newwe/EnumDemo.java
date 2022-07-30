package newwe;

enum Drinks{
    CocaCola,Thumpsup,Sprit,Sodha,Frooti,Pepsi
}

public class EnumDemo {
    public static void main(String[] args) {
        Drinks d;
        d = Drinks.Frooti;
        System.out.println("Give me :- "+d);

    }
}
