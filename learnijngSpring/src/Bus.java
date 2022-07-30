
interface Design{
    void Colour(String Name);
}
class Paint implements Design{

    @Override
    public void Colour(String Name) {
        System.out.println("Red");
    }
}
public class Bus {
    private static String Paint;

    public static void main(String[] args) {
        Paint p = new Paint();
        p.Colour(Paint);


    }
}
