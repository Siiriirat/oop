public class TwoThread{
	public static void main(String[] args) {
		SumThread s1 = new SumThread(1,3);
		SumThread s2 = new SumThread(1,3);
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}
		catch(InterruptedException x){}
		int sum = s1.getSum()+s2.getSum();
		System.out.println(sum+"");

	}
		
}