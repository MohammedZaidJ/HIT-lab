package day13;

public class ThreadDemo5 {
	public static void main(String[] args) {
		GoToSleep gs=new GoToSleep();
		DontGoToSleep dgs=new DontGoToSleep();
		Thread thd=new Thread(gs,"zaid");
		Thread thg=new Thread(dgs,"thaqi");
		thd.start();
		thg.start();
		
		System.out.println("work done by me go to sleep....:)...");
	}
}
class GoToSleep implements Runnable{
	@Override
	public void run(){
		sleep();
	}
	void sleep(){
		System.out.println("Going to sleep ... "+Thread.currentThread().getName());
	}
}
class DontGoToSleep implements Runnable{
	@Override
	public void run(){
		study();
	}
	void study(){
		System.out.println("Reading the book ... "+Thread.currentThread().getName());
	}
	
}
