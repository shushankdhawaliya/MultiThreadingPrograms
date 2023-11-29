/**
 * JoinMethodDemo
 */
class JoinMethodDemo extends Thread{
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
public class JoinMethod {
    public static void main(String[] args) {
        YieldMethodDemo ymd=new YieldMethodDemo();
        ymd.start();
        
        for(int i=0;i<5;i++){
            try {
                ymd.join();
               System.out.println(Thread.currentThread().getName());
               Thread.sleep(1000); 
            } catch (Exception e) {
                System.out.println(e);
            }
    }
        
    }   
}
