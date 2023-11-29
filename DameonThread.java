/**
 * DameonThreadDemo
 */
class DameonThreadDemo extends Thread{
    public void run(){
        //isDaemon returns boolean if currentThread is Daemon Thread then is gives Daemon Thread output
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }
        else{
            System.out.println("Child Thread");
        }
    }
}
public class DameonThread {
    public static void main(String[] args) {

        DameonThreadDemo dtd=new DameonThreadDemo();
        //Note:- setDaemon Thread always call before starting the Thread else it generates Exception
        dtd.setDaemon(true);
        dtd.start();
    }
}
