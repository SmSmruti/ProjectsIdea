package newwe;

public class ExceptionHandlingDemo1 {
    public static void main(String[] args) {
        try{
            int a = 5/0;
            System.out.println("The Result will be :- ");
        } catch (Exception e) {
            System.out.println("Exception :- " + e.getMessage());
        }
        finally{
            System.out.println("Finally Execution is Compulsory");
        }
    }
}
