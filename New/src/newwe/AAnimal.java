package newwe;

abstract class Animal {
    abstract void eat();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats Raju");
    }
}

public class AAnimal {
    public static void main(String[] args) {
        Animal a = new Lion();
        a.eat();
    }
}
