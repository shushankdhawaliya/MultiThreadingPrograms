/**
 * PriorityThreadDemo
 */
class PriorityThreadDemo extends Thread{
    public void run(){
        System.out.println("Child Thread");
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class PriorityThread {
    public static void main(String[] args) {
        PriorityThreadDemo ptd=new PriorityThreadDemo();
        ptd.start();
        ptd.setPriority(3);
    }
}
