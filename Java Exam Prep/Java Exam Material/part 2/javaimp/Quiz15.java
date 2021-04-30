class Demo {
    static {
        System.out.println("Demo Class Static ");
    }
}
public class Quiz15
{
    static {
        System.out.println("Static Constructor...");
    }
    Quiz15() {
        System.out.println("Instance Constructor...");
    }
    public static void main(String[] args) {
        new Quiz15();
    }
}
