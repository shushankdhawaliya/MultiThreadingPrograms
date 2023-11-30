

class Table{  
    //void printTable(int n){//method not synchronized  
    void printTable(int n){
      System.out.println("1st line This can be run by both at same time or another thread first"+n);
      //Inside in this synchronization block will be achived at a time
      synchronized(this){
         for(int i=1;i<=10;i++){  
     System.out.println(n*i);
        }
      }
       System.out.println("2nd line This can be run by both at same time or another thread first"+n);
     try{
       
      Thread.sleep(400);  
     }
     catch(Exception e){System.out.println(e);}  
   
  
 }  
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class SynchronizedBlock{  
public static void main(String args[]){  
Table obj = new Table();//only one object  
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
}  
