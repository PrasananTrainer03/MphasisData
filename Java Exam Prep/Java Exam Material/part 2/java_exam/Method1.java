interface Hello {
    void sayHello();
}

class Demo {
    public static void greeting() {
        System.out.println("Welcome to Method References Concept...");
    }
}
public class Method1 {
    public static void main(String[] args) {
        // Now you have to refer SayHello method of Hello interface to greeting() of Demo class
        Hello h = Demo::greeting;
        h.sayHello();
    }
}