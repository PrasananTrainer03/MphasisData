public class P23 {
    static int x;
    public void incr() {
        ++x;
        System.out.println(x);
    }
    public static void main(String[] args) {
        P23 obj1 = new P23();
        P23 obj2 = new P23();
        P23 obj3 = new P23();
        obj1.incr();
        obj2.incr();
        obj3.incr();
    
    }
}

