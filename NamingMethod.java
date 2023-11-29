/**
 * NamingMethodDemo
 */
class NamingMethodDemo extends Thread{
    public void run(){
        System.out.println("Run Method");
        /*Thread is class which call the currentThread method directly(currentThread method is static method)
         and getName method returns the Name(String) of Thread*/
        System.out.println(Thread.currentThread().getName());
    }
}
public class NamingMethod {
    public static void main(String[] args) {
        NamingMethodDemo nmd=new NamingMethodDemo();
        /*setName method use for set the name to thread */
        nmd.setName("Thread1");
        nmd.start();
    }
}
