package core.testThread.day1.model;

/**
 * 1.通过抛出异常来停止线程的运行
 * @author wrg
 */
public class MyThread1 extends Thread {
	@Override
	public void run() {
		try{
			/**
			 * 这里我发现循环的次数足够大的时候，线程才能停止并抛出异常。这说明了使用myThread1.interrupt();来停止线程，
			 * 线程并不是马上停止，会等到正在处理的事情处理完了再停止后续的线程。
			 */
			for (int i = 0; i < 500000; i++) {
				if(this.isInterrupted()){
					System.out.println("线程已停止了,退出程序！！");
					throw new InterruptedException();
				}
				System.out.println(i+1);
			}
		}catch(InterruptedException e){
			System.out.println("进入catch");
			e.printStackTrace();
		}
	}
}
