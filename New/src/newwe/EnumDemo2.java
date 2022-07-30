package newwe;

enum  Restaurants{
    Dominos,NewMughlai,BiriyaniBox,Guchhi,Grand,Tisha,BijayaDhaba
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Restaurants r;
        r = Restaurants.BijayaDhaba;
        switch(r){
            case Dominos: System.out.println("Eating at :- "+r.Dominos);
            break;
            case NewMughlai: System.out.println("Eating at :- "+r.NewMughlai);
            break;
            case BiriyaniBox: System.out.println("Eating at :- "+r.BiriyaniBox);
            break;
            case Guchhi: System.out.println("Eating at :- "+r.Guchhi);
            break;
            case Tisha: System.out.println("Eating at :- "+r.Tisha);
            break;
            case Grand: System.out.println("Eating at :- "+r.Grand);
            break;
            case BijayaDhaba: System.out.println("Eating at :- "+r.BijayaDhaba);
            break;
        }
    }
}
