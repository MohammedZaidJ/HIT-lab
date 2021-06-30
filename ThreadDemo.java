package day11;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		t.setName("hi I am Zaid.../n");
		t.setPriority(21);
		System.out.println("sleep");
        System.out.println(t.getName());
		
	}

}
