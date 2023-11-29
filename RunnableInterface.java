/**
 * RunnableDemo
 */
class RunnableDemo implements Runnable{
    public void run(){
        System.out.println("Runnable Interface");
    }
    
}
public class RunnableInterface {
    public static void main(String[] args) {
        RunnableDemo rd=new RunnableDemo();
        Thread t=new Thread(rd);
        t.start();
    }
}
