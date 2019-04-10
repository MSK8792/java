package labTest;

class Q {
	int balamt;
	boolean valueset = false;
	synchronized int get() {
		while(!valueset) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted exception caught");
			}
		}
		System.out.println("Got "+balamt);
		valueset=false;
		notify();
		return balamt;
	}

	synchronized void put(int amount) {
		while(valueset) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println("Interrupted Exception caught");
			}
		}
		balamt=amount;
		valueset=true;
		System.out.println("Put "+balamt);
		notify();
	}
}

class Producer implements Runnable {
	Q que;
	Producer(Q que) {
		this.que=que;
		new Thread(this,"Producer").start();
	}
	public void run() {
		int amount=10000;
		while(true) {
			que.put(amount);
		}
	}
}

class Consumer implements Runnable {
	Q que;
	Consumer(Q que) {
		this.que=que;
		new Thread(this,"Consumer").start();
	}
	public void run() {
		while(true) {
			que.get();
		}
	}
}


public class p8 {
	public static void main(String args[]) {
		Q que=new Q();
		System.out.println("Press ctrl c to stop");
		new Producer(que);
		new Consumer(que);
	}
}
