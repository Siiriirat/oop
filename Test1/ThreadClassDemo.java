import java.util.Scanner;
class ThreadClassDemo { 
 
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter size of Array : ");
    n = sc.nextInt();
    int array[] = new int[n];
    for(int i = 0 ; i < n ; i++){
      System.out.print("Enter Integer : ");
      array[i] = sc.nextInt();
    }
    Maximumnumber m = new Maximumnumber(array,n) ;
     // Calling getMax() method for getting max value
    Thread t1 = new Thread(m);
    try{
       t1.start();
       t1.join();
       System.out.println("Max : "+m.getMax());
    }
    catch (InterruptedException e) {
    }
   
    
  } 
}