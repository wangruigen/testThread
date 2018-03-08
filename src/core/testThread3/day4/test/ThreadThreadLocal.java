package core.testThread3.day4.test;

import core.testThread3.day4.model.TA;
import core.testThread3.day4.model.TB;
import core.testThread3.day4.model.ThreadLocalTestModel;
/**
 * ThreadLocal的隔离性：每个线程能重ThreadLocal中取出自己的值。
 * @author wrg
 */
public class ThreadThreadLocal {
	public static void main(String[] args) {
		TA ta = new TA();
		TB tb = new TB();
		ta.start();
		tb.start();
		try{
			for (int i = 0; i < 100; i++) {
				ThreadLocalTestModel.tl.set("Main "+(i+1));
				System.out.println("Main get value "+ThreadLocalTestModel.tl.get());
				Thread.sleep(200);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
