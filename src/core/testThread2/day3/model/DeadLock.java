package core.testThread2.day3.model;
/**
 * java多线程死锁案列
 * @author wrg
 */
public class DeadLock {
	private String name;
	Object locka = new Object();
	Object lockb = new Object();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void methodA(String name){
		if("a".equals(name)){
			synchronized(locka){
				System.out.println("name="+name);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(lockb){
					System.out.println("locka to lockb");
				}
			}
			
		}
		if("b".equals(name)){
			synchronized(lockb){
				System.out.println("name="+name);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(locka){
					System.out.println("lockb to locka");
				}
			}
		}
	}
}
