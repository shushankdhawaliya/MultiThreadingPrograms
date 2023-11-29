/**
 * BasicMethodDemo
 */
class BasicMethodDemo extends Thread{
    public void run(){
        System.out.println("I'm in Run Method");
        /*Current Thread method is static method which can access direct by Thread class andd isAlive is native method 
        its return boolean value */
        System.out.println(Thread.currentThread().isAlive());
    }
    
}
//Main class
public class BasicMethods {
    public static void main(String[] args) {
        BasicMethodDemo bsd=new BasicMethodDemo();
        bsd.start();
    }
}
