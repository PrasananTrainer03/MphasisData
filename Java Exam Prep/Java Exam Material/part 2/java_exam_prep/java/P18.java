public class P18 {
    static {
      try {throw new Exception("my exception");
      }
      catch(Exception e){
        System.out.println("2");
      }
    }
 
    public static void main(String[] args){
      System.out.println("1");
    }
  }