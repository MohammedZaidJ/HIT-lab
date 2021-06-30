package day11;

public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t=new Thread();
        t.setName("hello everone ....");
        t.setPriority(10);
        System.out.println(t);
        for(int i=5;i>0;i--) {
        	
        	try {
        		System.out.println(i);
        		Thread.sleep(1000);
        	
        	}
        	catch(Exception h){
        		System.out.println(h);
        	}
        	
        }
        
	}

}
