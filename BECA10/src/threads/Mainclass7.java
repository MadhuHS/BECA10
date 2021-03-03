package threads;

class ThreadTask1 implements Runnable {
	String s1 = null;

	public ThreadTask1(String s1) {
		this.s1 = s1;
	}

	@Override
	public void run() {
		System.out.println("t1 starts...");
		System.out.println("t1 waiting to lock s1");

		synchronized (s1) {

			System.out.println("t1 locked s1");
			s1 = s1.concat("world");
			System.out.println(s1);
			System.out.println("t1 unlocked s1");
		}

	}
}

class ThreadTask2 implements Runnable {
	String s2 = null;

	public ThreadTask2(String s2) {
		this.s2 = s2;
	}

	@Override
	public void run() {
		System.out.println("t2 starts...");
		System.out.println("t2 waiting to lock s2");

		synchronized (s2) {
			System.out.println("t2 locked s2");
			s2 = s2.concat("java");
			System.out.println(s2);
			System.out.println("t2 unlocked s2");
		}

		System.out.println("t2 ends...");

	}
}

public class Mainclass7 {
	public static void main(String[] args) {

		String str = new String("hello");

		ThreadTask1 t1 = new ThreadTask1(str);
		ThreadTask2 t2 = new ThreadTask2(str);

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);

		th1.start();
		th2.start();

	}
}
