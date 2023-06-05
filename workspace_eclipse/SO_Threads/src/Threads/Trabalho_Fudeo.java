package Threads;

public class Trabalho_Fudeo extends Thread{
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		for(int i = 0; i< 50; i++){
			System.out.println(name + " na iteracao " + i);
		}
	}
	
	public static void main(String[] args) {
		LoopThread t0 = new LoopThread();
		LoopThread t1 = new LoopThread();
		LoopThread t2 = new LoopThread();
		
		t0.start();
		t1.start();
		t2.start();
	}

}
