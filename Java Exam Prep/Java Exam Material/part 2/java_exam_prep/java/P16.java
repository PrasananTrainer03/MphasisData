public class P16 {
    public static void main(String[] args) {
      //  test(101); 
        test(new Integer(101));
        // test(new Integer(101));
    }
    
      public static void test(Object lObject) {
        System.out.println("Object =" + lObject);
      }
    
  public static void test(Integer lObject) {
        System.out.println("Integer =" + lObject);
      }
    
      public static void test(Float lObject) {
        System.out.println("Float =" + lObject);
      }
    
    //   public static void test(long lValue) {
    //     System.out.println("long=" + lValue);
    //   }
}