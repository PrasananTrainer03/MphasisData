class Demo {
    static {
        System.out.println("Demo Static...");
    }
}
class C1 { 
    static {
        System.out.println("C1 con");
    }
    public C1() {
        System.out.println("Constructor C1");
    }
}
class C2 extends C1 { 
    static {
        System.out.println("C2 con");
    }
    public C2() {
        System.out.println("Constructor C2");
    }
}
public class P6 {
    public static void main(String[] args) {
       C2 obj = new C2();
    }
}