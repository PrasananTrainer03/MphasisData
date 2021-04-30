public class Quiz14
{
    static {
        System.out.println("Static Constructor...");
    }
    Quiz14() {
        System.out.println("Instance Constructor...");
    }
    public static void main(String[] args) {
        new Quiz14();
    }
}
