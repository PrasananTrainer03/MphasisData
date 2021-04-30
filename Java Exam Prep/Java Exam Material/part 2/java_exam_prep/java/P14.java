public class P14 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        try {
           a[6] = 4/5;
        } catch(NumberFormatException e) {
            System.out.println("Hi");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Size is Small...");
        } catch(ArithmeticException e) {
            System.out.println("Divi zero");
        } catch(Exception e) {
            System.out.println("Numformat");
        }
    }
}