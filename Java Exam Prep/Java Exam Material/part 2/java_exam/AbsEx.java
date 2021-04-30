abstract class Animal {
    abstract void name();
    abstract void type();
}

class Lion extends Animal {
    @Override
    public void name() {
        System.out.println("Name is Lion...");
    }
    @Override 
    public void type() {
        System.out.println("Its Wild Animal...");
    }
}

class Crocodile extends Animal {
    @Override
    public void name() {
        System.out.println("Name is Crocodile...");
    }
    @Override 
    public void type() {
        System.out.println("Its Water Animal...");
    }
}

public class AbsEx {
    public static void main(String[] args) {
        Animal[] arr = new Animal[] {new Lion(), new Crocodile()};
        for(Animal a : arr) {
            a.name();
            a.type();
        }
    }
}