package demo.launch;
import java.io.*;

class Employee123 implements Serializable{
	String name;
	int id;
	int age;
	public Employee123(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public Employee123() {
		super();
	}
	void disp() {
		System.out.println("ID: "+id +" Name: "+name + " age: "+ age);
	}
}
public class LaunchSerialization {
	public static void main(String[] args) throws IOException {
//		Employee123 emp=new Employee123("Akhil",1,23);
//		emp.disp();
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		
		File file=new File("C:\\\\Java\\\\LaunchFileHandling3\\JavaProgramming.txt");
		try {
//			FileOutputStream fos=new FileOutputStream(file);
//			oos=new ObjectOutputStream(fos);
//			oos.writeObject(emp);
			FileInputStream fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			Employee123 e=(Employee123) ois.readObject();
			e.disp();
			
		} catch (Exception e) {
			System.out.println("Some exception occured");
			e.printStackTrace();
		}
		finally {
//			oos.close();
			ois.close();
		}
		
	}

}
