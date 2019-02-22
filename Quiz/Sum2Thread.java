class Sum2Thread implements Runnable {
   
    Thread thread;
    int first,last,sum;
    Sum2Thread(int first,int last) {
        first = first;
        last  = last;
        thread = new Thread();
        thread.start();
    }
   
    public void run() {
       
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}