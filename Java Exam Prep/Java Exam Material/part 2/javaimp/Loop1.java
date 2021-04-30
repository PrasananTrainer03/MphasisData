public class Loop1 {

    public void show(int n) {
        int i=0;
        while(i < n) {
            System.out.println("Welcome to Java...");
            i++;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        Loop1 obj = new Loop1();
        obj.show(n);
    }
}