package core.testThread3.day3.model;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * 线程通过管道(PipeStream)字节流通信，写数据
 * @author wrg
 */
public class WriteDate {
	public void writeMethod(PipedOutputStream out){
		try{
			System.out.println("write:");
			for (int i = 0; i < 300; i++) {
				String outData = ""+(i+1);
				out.write(outData.getBytes());
				System.out.print(outData);
			}
			System.out.println();
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
