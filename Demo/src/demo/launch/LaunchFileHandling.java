package demo.launch;
import java.io.*;

public class LaunchFileHandling {

	public static void main(String[] args) {
		String path="C:\\Java\\LaunchFileHandling.txt";
		
		File file=new File(path);
		try {
			System.out.println(file.createNewFile());
		} catch (Exception e) {
			System.out.println("some exception occured");
		}
		System.out.println(file.isFile());//true
		
		System.out.println(file.isDirectory());//false
		
		File directory1 =new File("C:\\\\Java\\\\LaunchFileHandling2.");
		
		try {
			System.out.println(directory1.mkdir());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is directory "+directory1.isDirectory());
		
		
		File file2=new File("C:\\Java\\");
		
		int filesCount=(int)file2.length();
		
		System.out.println(filesCount);
		
		

	}

}
