abstract class Training {
    abstract void name();
    abstract void email();
}

class Krishna extends Training {
    @Override
    public void name() {
        System.out.println("Name is Krishna...");
    }
    @Override 
    public void email() {
        System.out.println("Email is krishna@gmail.com");
    }
}

class Maaz extends Training {
    @Override
    public void name() {
        System.out.println("Name is Maaz...");
    }
    @Override 
    public void email() {
        System.out.println("Email is maaz@gmail.com");
    }
}


public class AbsDemo {
    public static void main(String[] args) {
        // Training obj1 = new Krishna();
        // Training obj2 = new Maaz();
        Training[] arr = new Training[] {new Krishna(), new Maaz()};
        for(Training t : arr) {
            t.name();
            t.email();
        }
    }
}