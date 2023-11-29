/**
 * YieldMethodDemo
 */
class YieldMethodDemo extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
        
    }
}
public class YieldMethod {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName());
        } 
        YieldMethodDemo ymd=new YieldMethodDemo();
        ymd.start();
    }   
}
