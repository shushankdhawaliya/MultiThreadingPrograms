/**
 * SleepMethodDemo
 */
class SleepMethodDemo extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
                try {
                   System.out.println(Thread.currentThread().getName());
                   Thread.sleep(1000); 
                } catch (Exception e) {
                    System.out.println(e);
                }
        }
    }
}
public class SleepMethod {
    public static void main(String[] args) {
        SleepMethodDemo smd=new SleepMethodDemo();
        smd.start();
        for(int i=0;i<5;i++){
                try {
                   System.out.println(Thread.currentThread().getName());
                   Thread.sleep(1000); 
                } catch (Exception e) {
                    System.out.println(e);
                }
        }

    }
}
