@FunctionalInterface
interface IDemo {
    void show();
}

class Megha  {
    public void say() {
        System.out.println("Megha from MLP234...");
    }
}

class Mohit {
    public void say() {
        System.out.println("Hi I am Mohit from MLP233...");
    }
}
public class Fun1 {
    public static void main(String[] args) {
        IDemo obj = new Megha()::say;
        obj.show();

        IDemo obj2 = new Mohit()::say;
        obj2.show();
    }
}