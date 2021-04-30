enum Test {
    A, B, X, Y, P, C;
    private Test() {
        System.out.println("Hi");
    }
}

public class P44 {
    public static void main(String[] args) {
        Test t = Test.Y;
        System.out.println(t);
    }
}