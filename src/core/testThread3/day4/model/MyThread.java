package core.testThread3.day4.model;

public class MyThread extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("线程等待10秒");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
