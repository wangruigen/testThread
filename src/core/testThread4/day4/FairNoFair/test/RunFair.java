package core.testThread4.day4.FairNoFair.test;

import core.testThread4.day4.FairNoFair.MyService;

/**
 * 测试公平锁，打印结果有序
 * @author wangruigen
 */
public class RunFair {
	public static void main(String[] args) {
		final MyService myService = new MyService(true);//true 公平
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("线程："+Thread.currentThread().getName()+"运行了");
				myService.serviceMethod();
			}
		};
		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new Thread(runnable);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}
	}
}
