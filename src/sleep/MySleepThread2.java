package sleep;

public class MySleepThread2 extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("this Thread name is "+currentThread().getName()+" begin = "+System.currentTimeMillis());
			sleep(2000);
			System.out.println("this Thread name is "+currentThread().getName()+" end = "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
