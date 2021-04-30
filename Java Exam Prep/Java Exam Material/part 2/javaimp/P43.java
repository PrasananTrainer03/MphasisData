public class P43 {
    public void show() {
        if (null == null) {
            System.out.println("Correct A AND D");
        } else {
            System.out.println("Error B AND C");
        }
    }
    public static void main(String[] args) {
        new P43().show();
    }
}