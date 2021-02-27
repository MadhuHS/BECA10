package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadTask implements Runnable {
	@Override
	public void run() {
		System.out.println("Task executed");
	}

}

public class Mainclass4 {
	public static void main(String[] args) {
		ThreadTask t1 = new ThreadTask();

		ExecutorService ftp = Executors.newCachedThreadPool();

		for (int i = 1; i <= 5; i++) 
		{
			ftp.submit(t1);
		}
	}
}
