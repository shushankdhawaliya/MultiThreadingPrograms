class BookThreaterSeat{
    static int total_seats=20;
    static synchronized void bookseat(int seats){
        if(total_seats>=seats){
            System.out.println(seats+" Seats booked Successfully... ");
            total_seats=total_seats-seats;
            System.out.println("Seats left:"+total_seats);
        }
        else{
            System.out.println(seats+" Seats can't booked \nseats left"+total_seats);
        }
    }
}
class MyThread11 extends Thread{
    BookThreaterSeat bt;
    int seats;
    MyThread11(BookThreaterSeat bt,int seats){
        this.bt=bt;
        this.seats=seats;
    }
    public void run(){
        bt.bookseat(seats);
    }
}
class MyThread12 extends Thread{
    BookThreaterSeat bt;
    int seats;
    MyThread12(BookThreaterSeat bt,int seats){
        this.bt=bt;
        this.seats=seats;
    }
    public void run(){
        bt.bookseat(seats);
    }
}
public class StaticSynchronization {
    public static void main(String[] args) {
        BookThreaterSeat bts=new BookThreaterSeat();
        MyThread11 mt=new MyThread11(bts,12);
        mt.start();
        MyThread11 mt2=new MyThread11(bts,2);
        mt2.start();
         BookThreaterSeat bts2=new BookThreaterSeat();
        MyThread12 mt3=new MyThread12(bts2,10);
        mt3.start();
        MyThread12 mt4=new MyThread12(bts2,5);
        mt4.start();
        
    }
}
