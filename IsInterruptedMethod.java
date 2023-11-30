class IsInterruptMethodDemo extends Thread{
	public void run(){
//This interrupted() method will print true and it don't changed the status of interrupted() method (true->false)
	System.out.println(Thread.currentThread().isInterrupted());
        try {
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
	//if you will print this it print false bcs it will changed 
	System.out.println(Thread.currentThread().isInterrupted());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }	
}
/**
 * IsInterruptedMethod
 */
public class IsInterruptedMethod extends Thread{
    
    public static void main(String[] args) {
        IsInterruptMethodDemo imd=new IsInterruptMethodDemo();
        imd.start();
	imd.interrupt();
    }
}