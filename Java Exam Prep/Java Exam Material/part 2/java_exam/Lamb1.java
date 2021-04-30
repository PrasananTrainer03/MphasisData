interface ILamb1 {
    void show();
}

// class Test implements ILamb1 {
//     public void show() {
//         System.out.println("Test class...");
//     }
// }
public class Lamb1 {
    public static void main(String[] args) {
        ILamb1 obj1=() -> {
            System.out.println("Test Class...");
        };
        obj1.show();
    }
}