package demo;

class Producer extends Thread{
	Queue q;
	Producer(Queue q){
		this.q=q;
	}
	int i;
	@Override
	public  void run() {
		boolean flag=true;
		while(flag==true) {
			q.put(i++);
			
		}
	}
}

class Consumer extends Thread{
	Queue q;
	Consumer(Queue q){
		this.q=q;
	}
	int l;
	@Override
	public  void run() {
		boolean flag;
		while(flag=true) {
			q.get(l);
		}
		
	}
}

class Queue{
	boolean flag=true;
	int a;
	public synchronized void put(int x) {
		a=x;
		try {
		if(flag==true) {
			System.out.println("Producer has produced the value: "+a);
			flag=false;
			notify();
		}
		else if(flag==false){
			System.out.println("put method wait");
			wait();
			} 
		
		}
	catch (Exception e) {
		System.out.println("Some problem");
	}
		
	}
	public synchronized void get(int x) {
		
		try {
		if(flag==true) {
			System.out.println("get method wait");
			wait();
				} 
		else if(flag==false) {
			System.out.println("Consumer has consumed the value: "+a);
			flag=true;
			notify();
		}
		}
		catch (Exception e) {
			System.out.println("Some problem");
		}	
		
	}
}

public class MultiThreadingInterCommunication {

	public static void main(String[] args) {
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		
		p.start();
		c.start();
	}
}
