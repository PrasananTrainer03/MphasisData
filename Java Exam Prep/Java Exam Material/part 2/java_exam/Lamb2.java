interface ILamb2 {
    int calc(int x, int y);
}

public class Lamb2 {
    public static void main(String[] args) {
        ILamb2 ob1 = (x, y) -> {
            return x+y;
        };
        System.out.println(ob1.calc(12,5));
        ILamb2 ob2 = (x, y) -> {
            return x-y;
        };
        System.out.println(ob2.calc(12,5));
        ILamb2 ob3 = (x, y) -> {
            return x*y;
        };
        System.out.println(ob3.calc(12,5));
    }
}