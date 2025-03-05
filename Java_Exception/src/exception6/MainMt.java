package exception6;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainMt {

	public static void main(String[] args) {
		
		String fileName = "c://test//data.text";
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName)){
			String line = br.readLine();
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
