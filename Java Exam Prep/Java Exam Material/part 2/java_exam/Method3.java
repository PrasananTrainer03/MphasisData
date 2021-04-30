interface ITest {
    void say();
}

class RefEx {
    public void show() {
        System.out.println("Welcome to Method references...");
    }
}
public class Method3 {
    public static void main(String[] args) {
        RefEx obj = new RefEx();
        ITest t = obj::show;
        t.say();
    }
}