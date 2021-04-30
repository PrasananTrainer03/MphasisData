public class Quiz2
{
    public void show(double x) {
        System.out.println("Show w.r.t. Double " +x);
    }
    public void show(Object x) {
        System.out.println("Show w.r.t. Object " +x);
    }
   
    public static void main( String[] args )
    {
        Quiz2 obj = new Quiz2();
        obj.show(12);
      
    }
}
