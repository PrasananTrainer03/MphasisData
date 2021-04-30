public class Quiz5
{
    public void show(Integer x) {
        System.out.println("Show w.r.t. Integer " +x);
    }
    public void show(Object x) {
        System.out.println("Show w.r.t. Object " +x);
    }
   
    public static void main( String[] args )
    {
        Quiz5 obj = new Quiz5();
        obj.show(new Integer(12));
      
    }
}
