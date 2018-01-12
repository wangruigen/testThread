package core.testThread2.day1.model;
/**
 * 方法中的变量是线程安全的，方法外的成员变量可能被多线程访问，下面是成员变量非线程安全案列
 * @author wrg
 */
public class ObjectHasPrivate {
	private long i;
	
	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}

	//public void addI(String username){//未同步,会出现数据脏读（数据被其他线程修改，当前线程读到的数据不是正确的数据）
	synchronized public void addI(String username){//同步方法
		try{
			if("a".equals(username)){
				this.i = 100;
				System.out.println("I am a");
				Thread.sleep(2000);
			}else{
				this.i = 200;
				System.out.println("I am b");
			}
			System.out.println("username="+username+" i="+i);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
