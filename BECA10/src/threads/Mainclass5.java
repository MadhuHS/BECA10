package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class BackupTask implements Runnable {
	@Override
	public void run() {
		System.out.println("Backup Task started");

		System.out.println("Backup Task completed");
	}

}

class LoadPostsTask implements Runnable {
	@Override
	public void run() 
	{
		System.out.println("Load all posts ");
	}

}

public class Mainclass5 {
	public static void main(String[] args) {
		BackupTask t1 = new BackupTask();
		LoadPostsTask t2 = new LoadPostsTask();

		ScheduledExecutorService stp = Executors.newScheduledThreadPool(4);
		stp.scheduleAtFixedRate(t1,2,5,TimeUnit.SECONDS);
		stp.schedule(t2,5,TimeUnit.SECONDS);
        
		
	}
}
