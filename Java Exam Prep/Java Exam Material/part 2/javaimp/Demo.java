
class Data {
    public void sayHello() {
        System.out.println("Welcome to Java...");
    }
    private void trainer() {
        System.out.println("Trainer Prasanna...");
    }
    void topic() {
        System.out.println("Java Day1 Topics...");
    }
}

public class Demo {
    public static void main(String[] args) {
        Data obj = new Data();
        obj.topic();
        obj.sayHello();
    }
}