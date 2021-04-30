public class Quiz3
{
    public void show(int x) {
        System.out.println("Show w.r.t. int " +x);
    }
    public void show(Object x) {
        System.out.println("Show w.r.t. Object " +x);
    }
   
    public static void main( String[] args )
    {
        Quiz3 obj = new Quiz3();
        obj.show(new Integer(12));
      
    }
}
