package main;

import java.io.*;

public class LaunchFileHandling1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=null;
		String path="C:\\Java\\LaunchFileHandling3";
		File directory=new File(path);
		File file=new File("C:\\\\Java\\\\LaunchFileHandling3\\JavaProgramming.txt");
		directory.mkdir();
		
		try {
			fw=new FileWriter(file);
			fw.write("Java");
			fw.write("\n");
			fw.write(65);
			fw.write("\n");
			char[] carray= {'J','A','V','A'};
			fw.write(carray);
			System.out.println("Check Text File");
		}
		
		catch(Exception e) {
			System.out.println("Some exception occured");
			e.printStackTrace();
		}
		finally {
			fw.close();
		}
	}

}
