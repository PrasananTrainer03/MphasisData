class First {
    public void show() {
        System.out.println("Show From First...");
    }
}

class Second extends First {
    public void show() {
        System.out.println("Show From Second...");
    }
}
public class P3 {
    public static void main(String[] args) {
        // Second obj = new Second();
        // obj.show();
        First obj = new Second();
        // obj.show();
        First obj1 = new First();
        Second obj2 = new Second();
        // First f =(First)obj2;
        // f.show();
        First s =(Second)obj1;
        s.show();
    }
}