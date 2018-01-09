package test;

import model.MyThreadModel;

public class TestMyThreadModel {
	public static void main(String[] args) {
		MyThreadModel model = new MyThreadModel();
		Thread thread = new Thread(model);
		thread.start();
		System.out.println("main");
	}
}
