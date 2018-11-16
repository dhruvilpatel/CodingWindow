package threads;

public class DeadlockTwoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread td1 = new Thread(new Runnable1());
		Thread td2 = new Thread(new Runnable2());
			
		td1.start();
		td2.start();
		try {
			td2.join();
		}catch(InterruptedException e){
			System.out.println("Exception thrown: " + e);
		}
		
		try {
			td1.join();
		}catch(InterruptedException e){
			System.out.println("Exception thrown: " + e);
		}
			
		
		System.out.println("Never Executed");
	}

}

class Runnable1 implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Thread 1 Waiting for thread 2 to finish");
		try {
			synchronized (this) {
				this.wait();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Exception occured");
		}
		
	}
	
}

class Runnable2 implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Thread 2 Waiting for thread 1 to finish");
		try {
			synchronized (this) {
				this.wait();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}