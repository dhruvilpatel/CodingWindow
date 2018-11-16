package threads;

public class MainThreadDeadlock{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread td = new Thread(new DeadlockHelper());
		td.start();
		try {
			// The main thread is waiting for the completion which will never happen until executed hence deadlocked.
			Thread.currentThread().join();
		}catch(InterruptedException e) {
			System.out.println("Exception Thrown: " + e);
		}
		System.out.println("Never Executed");
	}
	
}

class DeadlockHelper implements Runnable{
	@Override
	public void run() {
		
		System.out.println("Thread entered into deadlock");
		
	}
}