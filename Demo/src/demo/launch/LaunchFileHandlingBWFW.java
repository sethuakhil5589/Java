package demo.launch;

import java.io.*;


public class LaunchFileHandlingBWFW {

	public static void main(String[] args) throws IOException {
		FileWriter fw=null;
		BufferedWriter bw=null;
		String path="C:\\Java\\LaunchFileHandling3";
		File directory=new File(path);
		File file=new File("C:\\\\Java\\\\LaunchFileHandling3\\JavaProgramming.txt");
		directory.mkdir();
		
		try {
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			fw.write("Java is best Programming Language");
			bw.newLine();
			
		}
		catch(Exception e) {
			
		}
		finally {
			fw.close();
		}

	}

}
