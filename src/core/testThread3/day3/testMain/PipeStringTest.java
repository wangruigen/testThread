package core.testThread3.day3.testMain;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.junit.Test;

import core.testThread3.day3.model.ReadData;
import core.testThread3.day3.model.ThreadRead;
import core.testThread3.day3.model.ThreadWrite;
import core.testThread3.day3.model.WriteDate;

public class PipeStringTest {
	
	@Test
	public void testPipeByByteStream(){
		WriteDate writeDate = new WriteDate();
		PipedOutputStream outputStream = new PipedOutputStream();

		ReadData readData = new ReadData();
		PipedInputStream inputStream = new PipedInputStream();
		
		try {
			/*
			 * 使用代码inputStream.connect(outputStream)或outputStream.connect(inputStream)
			 * 是使两个Stream之间产生通信链接，这样才可以将数据进行输出与输入
			 */
			//inputStream.connect(outputStream);
			outputStream.connect(inputStream);
			
			ThreadWrite threadWrite = new ThreadWrite(writeDate, outputStream);
			threadWrite.start();
			Thread.sleep(2000);
			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
