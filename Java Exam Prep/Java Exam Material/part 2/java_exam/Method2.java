interface Calc {
    void sum(int x, int y);
}

class Test {
    public static void compute(int x, int y) {
        int c =x+y;
        System.out.println("Sum is  " +c);
    }
}
public class Method2 {
    public static void main(String[] args) {
        Calc c = Test::compute;
        c.sum(12,5);
    }
}