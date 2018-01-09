package core.testThread.day2.model.test;

import core.testThread.day2.model.SynchronizedObject;

public class TestSynchronizedObject {
	public static void main(String[] args) {
		try{
			final SynchronizedObject synchronizedObject = new SynchronizedObject();
			Thread thread1 = new Thread(){
				public void run() {
					synchronizedObject.printString();
				};
			};
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			Thread thread2 = new Thread(){
				@Override
				public void run() {
					System.out.println("线程2启动，但是进不了printString方法，"
							+ "因为已被a线程锁定并且永远暂停了,线程2只能永远等待线程a恢复暂停。");
					synchronizedObject.printString();
				}
			};
			thread2.start();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
