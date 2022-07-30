package eightConcept;

public class AnonymousDemo {

    @FunctionalInterface
    interface Printer {
        void print(String message); //By Default PUBLIC ABSTRACT
    }

    static void show(){
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println("This is an anonymous class for printer interface and your message is : "+ message);
            }
        };
        printer.print("Sachin is a good girl");
    }

    public static void main(String[] args) {
        show();
    }


}
