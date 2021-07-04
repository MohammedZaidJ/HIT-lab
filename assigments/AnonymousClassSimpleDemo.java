package day15assigments;

public class AnonymousClassSimpleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread() {
			public void run() {
				Thread.currentThread().setName("zain");
				System.out.println("create thread..."+getName());
			}
		};
		t.start();
		System.out.println("main thread...");	
			
		
	}

}
