package core.testThread3.day2.model;

/**
 * 生产者
 * @author wrg
 */
public class P {
	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public P() {
		super();
	}
 	
	public String getLock() {
		return lock;
	}

	public void setLock(String lock) {
		this.lock = lock;
	}

	public void setValue(){
		try{
			synchronized (lock) {
				if(!ValueObject.value.equals("")){
					lock.wait();
				}
				String value = System.currentTimeMillis()+"_"+System.nanoTime();
				ValueObject.value = value;
				System.out.println("set value="+value);
				lock.notify();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
