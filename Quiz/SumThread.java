// SumThread.java
public class SumThread extends Thread  {
	private int first,last,sum;
	public SumThread(int first,int last){
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

}
