/**
 * Demo
 */
class ThreadDemo extends Thread{
    public void run(){
        System.out.println("Thread Class");
    }
}
/**
 * ThreadClass
 */
public class ThreadClass {
    public static void main(String[] args) {
        ThreadDemo td=new ThreadDemo();
        td.start();
    }
}