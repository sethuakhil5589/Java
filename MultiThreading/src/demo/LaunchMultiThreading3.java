package demo;


class CarShare implements Runnable{
	@Override
	public  void run() {
		try {
		System.out.println(Thread.currentThread().getName()+" entered parking lot");
		Thread.currentThread().sleep(4000);
		
		synchronized (this){
		System.out.println(Thread.currentThread().getName()+" Entered car");
		Thread.currentThread().sleep(4000);
		
		System.out.println(Thread.currentThread().getName()+" Started car");
		Thread.currentThread().sleep(4000);
		
		System.out.println(Thread.currentThread().getName()+" Came back");
		Thread.currentThread().sleep(4000);
		}
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class LaunchMultiThreading3 {

	public static void main(String[] args) {
		CarShare car=new CarShare();
		
		Thread t1=new Thread(car);
		Thread t2=new Thread(car);
		Thread t3=new Thread(car);
		
		t1.setName("Child-1");
		t1.setName("Child-2");
		t1.setName("Child-3");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
