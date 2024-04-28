package demo;

class Library implements Runnable{
	String res1=new String("Java");
	String res2=new String("DSA");
	String res3=new String("Springboot");
	
	
	public void run() {
		try {
		if(Thread.currentThread().getName().equals("student1")){
			Thread.sleep(4000);
			synchronized (res1){
				System.out.println("Student-1 aquired first book : "+ res1);
				Thread.sleep(4000);
				synchronized (res2){
					System.out.println("Student-1 aquired second book : "+res2);
				Thread.sleep(4000);
				synchronized (res3){
					System.out.println("Student-1 aquired third book : "+res3);
					Thread.sleep(4000);
				}
				}
			}
		}
		
		else if(Thread.currentThread().getName().equals("student2")){
			Thread.sleep(4000);
			synchronized (res3){
				System.out.println("Student-2 aquired first book : "+ res3);
				Thread.sleep(4000);
				synchronized (res2){
					System.out.println("Student-2 aquired second book : "+res2);
				Thread.sleep(4000);
				synchronized (res1){
					System.out.println("Student-2 aquired third book : "+res1);
					Thread.sleep(4000);
				}
				}
			}
		}
		}
		catch (InterruptedException e) {
				System.out.println("Some problem");
			}
		}
	}
public class LaunchMultiThreading_InterCommunication {

	public static void main(String[] args) {
		Library lib=new Library();
		
		Thread t1=new Thread(lib);
		Thread t2=new Thread(lib);
		
		t1.setName("student1");
		t2.setName("student2");
		
		t1.start();
		t2.start();
	}
}
