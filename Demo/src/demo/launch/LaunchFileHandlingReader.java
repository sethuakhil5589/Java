package demo.launch;

import java.io.*;


public class LaunchFileHandlingReader {

	public static void main(String[] args) throws IOException {
		FileReader fr=null;
		String path="C:\\Java\\LaunchFileHandling3";
		File directory=new File(path);
		File file=new File("C:\\\\Java\\\\LaunchFileHandling3\\JavaProgramming.txt");
		directory.mkdir();
		
		try {
			fr=new FileReader(file);
			int length=(int) file.length();
			char[] cArray=new char[length];
			fr.read(cArray);
//			int i=fr.read();
			for(int i=0;i<length;i++) {
				System.out.println(i +"-->"+cArray[i]);
			}
			
			
		}
		catch(Exception e) {
			System.out.println("Some exception occured");
			e.printStackTrace();
		}
		finally {
			fr.close();
		}

	}

}
