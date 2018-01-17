package core.testThread2.day4.model;

/**
 * volatile修饰的变量，当线程访问isRuning这个变量的时候，每次都强制
 * 从公共堆栈中进行取值
 * @author wrg
 */
public class RunThread extends Thread {
	/**
	 * volatile
	 */
	volatile private boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		System.out.println("into run method");
		while(isRunning == true){
			
		}
		System.out.println("out run method");
	
	}
}
