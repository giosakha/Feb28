import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
//method that reads a text file and may htrow an Exception(filenotfound , notreadable , etc)
	public static void readFile(String filepath)throws IOException {
		// try with resources to automatically close the reader exception
		try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
			String line;
			while((line = br.readLine()) !=null){
				System.out.println(line);
			}
			
		}
	}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
//code to process a file
		try {
			String filePath = "C://Users//2377126//Desktop//Gio";
		readFile(filePath);
		} catch (IOException e) {
			System.out.println("Error reading the file" + e.getMessage());
		}
		
	}

}
