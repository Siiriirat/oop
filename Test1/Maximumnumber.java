// Maximumnumber.java
public class Maximumnumber implements Runnable{
	private int max;
	private int[] arr;
	public Maximumnumber(int[] arr,int n){
		max = arr[0];
		this.arr = new int[n];
		    for(int i = 0;i < n ; i++)
			    this.arr[i] = arr[i];
	}
	public void run(){
    		for(int i=1;i < arr.length;i++){ 
      			if(arr[i] > max){ 
         		max = arr[i]; 
      			} 
    		}
	}
	public int getMax(){
		return max;
	}


}