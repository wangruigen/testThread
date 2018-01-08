package sameNum;

public class TestSameNum {
	public static void main(String[] args) {
		SameNumThread thread = new SameNumThread();
		Thread a = new Thread(thread,"a");
		Thread b = new Thread(thread,"b");
		Thread c = new Thread(thread,"c");
		Thread d = new Thread(thread,"d");
		Thread e = new Thread(thread,"e");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
