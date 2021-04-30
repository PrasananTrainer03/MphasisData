public class SwitchEx {

    public void show(int n) {
        switch(n) {
            case 1 : 
                System.out.println("Hi I am Gowri...");
                break;
            case 2 : 
                System.out.println("Hi I am Harini...");
                break;
            case 3 : 
                System.out.println("Hi I am Jeevith...");
                break;
            case 4 :
                System.out.println("Hi I am Janan...");
                break;
            case 5 : 
                System.out.println("Hi I am Kannan...");
                break;
            case 6 : 
                System.out.println("Hi I am Lakshmi...");
                break;
            default : 
                System.out.println("Invalid Data....");
                break;
        }
    }
    public static void main(String[] args) {
        int n=5;
        SwitchEx obj = new SwitchEx();
        obj.show(n);
    }
}