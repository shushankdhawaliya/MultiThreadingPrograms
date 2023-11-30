/**
 * InterruptMethodDemo
 */
class InterruptMethodDemo extends Thread{
    public void run(){
        try{
             for(int i=0;i<5;i++){
            System.out.println(i);
            Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
    
}
public class InterruptMethod {
    public static void main(String[] args) {
        InterruptMethodDemo imd=new InterruptMethodDemo();
        imd.start();
        imd.interrupt();
    }
}
