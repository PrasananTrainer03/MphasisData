public class Quiz18
{
    static int score;
    static {
        score=0;
    }
    public void incr() {
        score++;
    }
    public static void main(String[] args) {
        Quiz18 obj1 = new Quiz18();
        Quiz18 obj2 = new Quiz18();
        Quiz18 obj3 = new Quiz18();

        obj1.incr();
        obj2.incr();
        obj3.incr();

        System.out.println(obj1.score);
    }
}
