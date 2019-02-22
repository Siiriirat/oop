import java.util.Scanner;
class ThreadClassDemo { 
 
  public static void main(String args[]){
    int array[] = new int[]{10, 11, 88, 2, 12, 120};
    Maximumnumber m = new Maximumnumber(array,array.length) ;
     // Calling getMax() method for getting max value
    Thread t1 = new Thread(m);
    try{
       t1.start();
       t1.join();

       System.out.println(""+m.getMax());
    }
    catch (InterruptedException e) {
    }
   
    
  } 
}