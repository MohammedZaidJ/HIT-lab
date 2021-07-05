package day15assigments;

public class ClassLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample  t=new sample();
		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(sample.class) {
				t.met1();
				}
			}
			
		}).start(); 
		sample  t1=new sample();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized(sample.class) {
				t1.met2();
				}
			}
			
		}).start();	
		

	}

}
class sample{
	static int money=10;
	public static void met1(){
		money=money+30;
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {  }
		System.out.println("from the method1 called by Thread.. :"+money);
	}
    public static void met2(){
    	money=money+20;
    	try {
			Thread.sleep(2000);
		}
		catch(Exception e) {  
			
		}
    	System.out.println("from the method2 called by Thread.. :"+money);
	
	}
	
	
}