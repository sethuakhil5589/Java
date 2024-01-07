package demo.launch;
import java.io.*;

public class LaunchFileHandlingBRFR {

	public static void main(String[] args) {
		FileReader reader=null;
		BufferedReader bReader=null;
		String path="C:\\Java\\LaunchFileHandling3";
		
		File directory=new File(path);
		File file=new File("C:\\\\Java\\\\LaunchFileHandling3\\JavaProgramming.txt");
		System.out.println(directory.mkdir());
		
		try {
			System.out.println(file.createNewFile());
			reader=new FileReader(file) ;
			bReader=new BufferedReader(reader);
			String line=bReader.readLine();
			
			System.out.println(line);
			while (line !=null) {
				System.out.println(line);
				line=bReader.readLine();
			}
			
		} catch (Exception e) {
			System.out.println("Some exception Occured");
			e.printStackTrace();
		}
		

	}

}
