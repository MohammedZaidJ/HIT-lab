package Revision4;

public class ThreadDemo2 {
	public ThreadDemo2() {
		System.out.println("cons called");
		new Thread(new Runnable1()).start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread line 1 ...");
		new ThreadDemo2();
		try {
			Thread.sleep(4000);
		}catch(Exception e) {}
		System.out.println("main thread line 2 ...");

	}

}
class Runnable1 implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}
