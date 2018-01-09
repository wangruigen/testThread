package core.testThread.day2.model.warning;
/**
 * 线程中出现System.out.println();方法时，使用suspend()方法时，会出现线程占用的情况，因为println()方法是sychronized的方法
 * @author wrg
 */
public class Warning extends Thread{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		while(true){
			i++;
			System.out.println("i="+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Warning warning = new Warning();
		warning.start();
		Thread.sleep(1000);
		warning.suspend();
		System.out.println("end");//没有打印end，因为被线程warning里面的plantLn()方法占用了

	}
}
