public class CalcDemo {
    public void calc(int a, int b) {
        int c = a + b;
        System.out.println("Sum is  " +c);
    }
    public static void main(String[] args) {
        int a, b;
        a=5;
        b=7;
        CalcDemo obj = new CalcDemo();
        obj.calc(a,b);
    }
}