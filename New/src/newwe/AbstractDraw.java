package newwe;

abstract class shape {
    abstract void draw();
}

class rectangle extends shape {
    void draw() {
        System.out.println("Draw a Rectangle");
    }
}

class circle extends shape {

    @Override
    void draw() {
        System.out.println("Draw a Circle");
    }
}

public class AbstractDraw {
    public static void main(String[] args) {

        shape s1 = new rectangle();
        shape s = new circle();
        s.draw();
        s1.draw();

    }
}
