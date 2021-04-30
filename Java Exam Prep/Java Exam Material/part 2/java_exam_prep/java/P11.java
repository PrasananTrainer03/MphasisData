public class P11 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            throw new NullPointerException();
        } catch(ArithmeticException e) {
            System.out.println("B");
        } catch(Exception e) {
            System.out.println("D");
        }
    }
}
