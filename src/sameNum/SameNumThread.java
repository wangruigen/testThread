package sameNum;

public class SameNumThread extends Thread {
	private int num = 5;
	@Override
	public void run() {
		//run()不是同步的，在进入println()[synchronized (this)]同步方法之前，num--会出现非线程安全的问题
		System.out.println("num="+(num--)+" ThreadName="+Thread.currentThread().getName());
	}
}
