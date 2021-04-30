public class Quiz9
{
    int x;
    public static void main( String[] args )
    {
        Quiz9 obj1 = new Quiz9();
        obj1.x=12;
        Quiz9 obj2 = obj1;
        obj2.x=13;
        System.out.println(obj1.x);
    }
}
