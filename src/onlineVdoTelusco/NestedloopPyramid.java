package onlineVdoTelusco;

public class NestedloopPyramid {
    public static void main(String[] args) {

        for(int p = 1;p<=6;p++){
            for(int r =1;r<=p;r++) {
                System.out.print(" * ");
            }
            System.out.println();  //only for next line..
        }
    }
}
