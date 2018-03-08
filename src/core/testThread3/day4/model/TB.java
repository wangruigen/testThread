package core.testThread3.day4.model;

public class TB extends Thread {
	@Override
	public void run() {
		try{
			for (int i = 0; i < 100; i++) {
				ThreadLocalTestModel.tl.set("TB "+(i+1));
				System.out.println("TB get value "+ThreadLocalTestModel.tl.get());
				Thread.sleep(200);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
