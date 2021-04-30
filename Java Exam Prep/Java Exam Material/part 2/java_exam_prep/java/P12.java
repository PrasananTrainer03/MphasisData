public class P12 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            throw new NullPointerException();
        } catch(ArithmeticException e) {
            System.out.println("B");
        } catch(NullPointerException e) {
            System.out.println("C");
        } catch(Exception e) {
            System.out.println("D");
        } finally {
            System.out.println("Z");
        }
    }
}
