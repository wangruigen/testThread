package core.testThread3.day4.model;

public class TA extends Thread {
	@Override
	public void run() {
		try{
			for (int i = 0; i < 100; i++) {
				ThreadLocalTestModel.tl.set("TA "+(i+1));
				System.out.println("TA get value "+ThreadLocalTestModel.tl.get());
				Thread.sleep(200);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
