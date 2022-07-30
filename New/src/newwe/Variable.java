package newwe;

public class Variable {
    static int s = 20;     //Static Variable
    int i = 30;            //Instance variable

    public static void main(String[] args) {
        int l = 10;        //Local Variable
        System.out.println(l);
        System.out.println(Variable.s);
        Variable v = new Variable();
        System.out.println(v.i);
    }
}
