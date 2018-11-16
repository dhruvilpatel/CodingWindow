package threads;

public class MultipleThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable t = new Thread1();
		Thread t1 = new Thread(t);
		t1.start();
		Thread t2 = new Thread(new Thread2());
		t2.start();
	}

}

class Thread1 implements Runnable{
	
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++)
			
			try {
				System.out.println("Thread 1 Printing: " + i );
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	
}

class Thread2 implements Runnable{
	
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++)
			
			try {
				System.out.println("Thread 2 Printing: " + i );
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
}