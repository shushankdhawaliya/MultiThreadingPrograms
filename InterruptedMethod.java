class InterruptMethodDemo extends Thread{
	public void run(){
//This interrupted() method will print true but it backend it changed the status of interrupted() method (true->false)
	System.out.println(Thread.interrupted());
        try {
            for(int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
	//if you will print this it print false bcs it will changed 
	//System.out.println(Thread.interrupted());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }	
}
/**
 * InterruptedMethod
 */
public class InterruptedMethod extends Thread{
    
    public static void main(String[] args) {
        InterruptMethodDemo imd=new InterruptMethodDemo();
        imd.start();
	imd.interrupt();
    }
}