package core.testThread3.day2.model;
/**
 * 消费者
 * @author wrg
 */
public class C {
	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}

	public C() {
		super();
	}

	public String getLock() {
		return lock;
	}

	public void setLock(String lock) {
		this.lock = lock;
	}

	public void getValue(){
		try{
			synchronized (lock) {
				if(ValueObject.value.equals("")){
					lock.wait();
				}
				System.out.println("get value="+ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
