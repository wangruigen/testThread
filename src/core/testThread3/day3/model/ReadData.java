package core.testThread3.day3.model;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * 线程通过管道(PipeStream)字节流通信，读数据
 * @author wrg
 */
public class ReadData {
	public void readMethod(PipedInputStream input){
		try{
			System.out.println("read:");
			byte[] byteArray = new byte[20];
			int readLength = input.read(byteArray);
			while((readLength!=-1)){
				String newDate = new String(byteArray, 0, readLength);
				System.out.print(newDate);
				readLength = input.read(byteArray);
			}
			System.out.println();
			input.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
