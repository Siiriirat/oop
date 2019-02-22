
public class Sum2ThreadMain {
   
    public static void main(String args[]) {
       
        // Since the constructor of the PrintNameRunnable
        // object creates a Thread object and starts it,
        // there is no need to do it here.
        new Sum2Thread(1,2);
       
        new Sum2Thread(1,2);
       
    }
}