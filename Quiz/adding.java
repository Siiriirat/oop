class Adding implements Runnable{
    int a,b; 
    public Adding(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void run() {
        add(a,b);
    }
    public void add(int a, int b){
        int sum=0;
        synchronized (this) {
            for(int i=a;i<=b;i++){
                sum = sum+ a;
            }
            System.out.println("Sum of "+a+" to "+ b+" numbers = "+sum);    
        }
    }



    public static void main(String[] args) {
        Thread t1 = new Thread(new Adding(1,10));
        Thread t2 = new Thread(new Adding(1,50));
        Thread t3 = new Thread(new Adding(5,15));
        Thread t4 = new Thread(new Adding(10,20));
        Thread t5 = new Thread(new Adding(15,20));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
