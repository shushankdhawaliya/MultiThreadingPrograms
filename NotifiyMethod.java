class TotalEarnings extends Thread{
    int total=0;
    public void run(){
        synchronized (this){
            for(int i=0;i<=10;i++){
                total=total+100;
            }
            this.notify();
        }
    }
}
public class NotifiyMethod {
    public static void main(String[] args) throws InterruptedException{
        TotalEarnings te=new TotalEarnings();
        te.start();
        //System.out.println("Total earnings "+te.total+"rs");
        synchronized(te){
            te.wait();
            System.out.println("Total earnings"+te.total+"rs");
        }
    }
}
