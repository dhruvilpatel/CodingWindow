package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class ExecutorSample {
	Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	BlockingQueue<Integer> bQ = new LinkedBlockingQueue<>(10);

	int index = 0;
	ExecutorService service = Executors.newFixedThreadPool(10);

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// TODO Auto-generated method stub
		// CalculateSquare cs = new CalculateSquare();
		// try {
		// System.out.println(cs.calculate(5).get().toString());
		// } catch (InterruptedException | ExecutionException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// LoopClass lc = new LoopClass();
		// lc.looper();
		//// LoopClass lc2 = new LoopClass();
		// lc.looper();
		//
		ExecutorSample s = new ExecutorSample();
		s.bQ.addAll(Arrays.asList(s.arr));
		List<Future<Integer>> x = new ArrayList<>();

		for (int i = 0; i < s.arr.length; i++) {
			x.add(s.calculate());
		}
		for (Future<Integer> y : x) {
			System.out.println(y.get());
		}
		s.service.shutdown();
	}

	public Future<Integer> calculate() {
		Callable<Integer> callableTask = () -> {
			Thread.sleep(6000);
			Integer y = bQ.poll();
			// Integer y = arr[index++]; // Not synchroonized can access same index and print same result
			return y * y;
		};
		return service.submit(callableTask);
	}

}

class CalculateSquare {

	// return service.submit(() -> input * input);

}

class LoopClass {

	ExecutorService service = Executors.newFixedThreadPool(2);

	public void looper() {
		for (int i = 0; i < 10; i++) {
			service.submit(() -> {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread " + Thread.currentThread().getName() + " value: ");

			});
		}
	}
}