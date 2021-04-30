
interface One {
    void name();
}

interface Two {
    void email();
}

class Sundaram implements One, Two {
    public void name() {
        System.out.println("Name is Sundaram...");
    }
    public void email() {
        System.out.println("Email sundaram@gmail.com");
    }
}
public class MultiInh {
    public static void main(String[] args) {
        Sundaram obj = new Sundaram();
        obj.name();
        obj.email();
    }
}