package model;

public class MyThread extends Thread{
	private int count = 5;
	
	public MyThread() {	}
	
	public MyThread(String name){
		super();
		this.setName(name);
	}
	@Override
	public synchronized void run() {
			count--;
			System.out.println("由："+currentThread().getName()+"计算count:"+count);
	}
}
