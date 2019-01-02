package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
			
		try {
			fis = new FileInputStream("text.txt");
			int data = fis.read();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) {
					fis.close();	
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
