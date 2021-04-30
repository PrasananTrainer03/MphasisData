
interface IOne {
    void name();
    void email();
}

class Jahnavi implements IOne {
    @Override 
    public void name() {
        System.out.println("Name is Jahnavi...");
    }
    @Override 
    public void email() {
        System.out.println("Email is jahnavi@gmail.com");
    }
}

class Krishna implements IOne {
    @Override 
    public void name() {
        System.out.println("Name is Krishna...");
    }
    @Override 
    public void email() {
        System.out.println("Email is krishna@gmail.com");
    }
}
public class Intf1 {
    public static void main(String[] args) {
        IOne[] arr = new IOne[] {new Jahnavi(), new Krishna()};
        for(IOne i : arr) {
            i.name();
            i.email();
        }
    }
}