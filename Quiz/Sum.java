// SumThread.java
public class Sum implements Runnable  {
	private int first,last,sum=0;
	public Sum(int first,int last){
		this.first = first;
		this.last  = last;
	}
	public void run(){
		for(int i = first ;i <= last ; i++){
			sum += i;
		}
	}
	public int getSum(){
		return sum;
	}
	public static void main(String[] args) {
		Sum s1    = new Sum(1,3);
		Sum s2    = new Sum(1,4);
		Thread t1 = new Thread (s1);
		Thread t2 = new Thread (s2);
		 
		try{
			t1.join();
			t2.join();
		}
		catch(InterruptedException x){}
	    int total = 0;
	    total = s1.getSum()+s2.getSum();
		System.out.println("SumThread :"+total);
	}
}
