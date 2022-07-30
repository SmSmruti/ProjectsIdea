package newwe;

public class Variable2 {
    static int s = 10;   //Static variable

    void add() {
        int l = 10;     //Local variable
        System.out.println(s + " " + l);   // 10 10
        ++l;     //11
        ++s;     //11
//        System.out.println(s +" " +l);
    }

    public static void main(String[] args) {
        Variable2 v = new Variable2();
        v.add();
        v.add();
    }
}
