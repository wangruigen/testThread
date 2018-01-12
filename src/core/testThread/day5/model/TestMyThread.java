package core.testThread.day5.model;

public class TestMyThread {
	public static void main(String[] args) {
		try{
			MyThread myThread = new MyThread();
			myThread.setDaemon(true);//把MyThread设置成守护线程，需在start之前设置
			myThread.start();
			Thread.sleep(5000);
			System.out.println("我执行了，守护线程MyThread退出，不再打印。");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
