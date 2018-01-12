package core.testThread.day4.model;

import java.util.Random;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		long stime = System.currentTimeMillis();
		long sum = 0;
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 10000; j++) {
				Random random = new Random();
				random.nextInt();
				sum+=j;
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println("t2 cost "+(endtime-stime));
	}
}
