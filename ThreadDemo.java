package Revision4;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First line");
		System.out.println("second line");
	    //new ThreadDemo().met();
	    // by using lambda hear
	    
	    //new Thread(()->{new ThreadDemo().met1();}).start();
		// using by runable ..
		
//	    new Thread(new Runnable() {
//	    	@Override 
//	    	public void run() {
//	    		new ThreadDemo().met1();
//	    	}
//	    }).start();
//	    //the other method
	    //by using myRunnable ...
		new Thread(new MyRunnable()).start();
		//new Thread(new MyRunnable()).start();
	    System.out.println("four line");
		

	}
//	public void met() {
//		try {Thread.sleep(4000);}catch(Exception e) {}
//		System.out.println("third line");
//		
//	}
    	public void met1() {
		try {Thread.sleep(4000);}catch(Exception e) {}
		System.out.println("third.one line");
		
	}
}
	class MyRunnable implements Runnable{
		@Override
		public void run() {
			new ThreadDemo().met1();
		}
	}


