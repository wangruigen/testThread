package core.testThread.day1.model;

public class MyThread2 extends Thread{
	@Override
	public void run() {
		while(true){
			if(this.isInterrupted()){
				System.out.println("线程已经停止了");
				return;
			}
			System.out.println("time"+System.currentTimeMillis());
		}
	}
}
