package designPatterns;

public class Singelton {

	public static Singelton singleton = null;

	public Singelton getSingleton() {
		if (singleton != null)
			return singleton;
		Singelton singleton = new Singelton();
		return singleton;
	}

}

class ThreadSafeSingelton {

	private ThreadSafeSingelton() {
	}

	private static ThreadSafeSingelton instance;

	public static synchronized ThreadSafeSingelton getInstance() {

		if (instance == null) {
			instance = new ThreadSafeSingelton();
			return instance;
		}
		return instance;

	}

	// public static synchronized ThreadSafeSingelton getInstance() {
	//
	// if(instance == null) {
	// synchronized(ThreadSafeSingelton.class) {
	// if(instance == null) {
	// instance = new ThreadSafeSingelton();
	// return instance;
	// }
	// }
	// }
	// return instance;
	//
	// }

}

class ClassSingleston {

	private static class SingletonHelper {
		private static final ClassSingleston instance = new ClassSingleston();
	}

	public ClassSingleston getInstance() {
		return SingletonHelper.instance;
	}

}