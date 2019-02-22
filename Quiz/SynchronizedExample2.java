public class SynchronizedExample2 {
   
    public static void main(String[] args) {
       
        TwoStrings ts = new TwoStrings();
       
        PrintStringsThread t = new PrintStringsThread("Hello ", "there.", ts);
        PrintStringsThread t1 = new PrintStringsThread("How are ", "you?", ts);
        PrintStringsThread t2 =new PrintStringsThread("Thank you ", "very much!", ts);
    }
   
}