package sleep;

public class MySleepThread extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("this Thread name is "+currentThread().getName()+" begin");
			sleep(2000);
			System.out.println("this Thread name is "+currentThread().getName()+" end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
