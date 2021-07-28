package Revision5;

public class Onetaskmanythreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drama d=new Drama();
		new Thread(()->{
			for(int i=0;i<5;i++) {
				d.emotions();
				try {Thread.sleep(2000);}catch(Exception e) {}
			}
		}).start();
		new Thread(()->{
			for(int i=0;i<5;i++) {
				d.comedy();
				try {Thread.sleep(2002);}catch(Exception e) {}
			}
		}).start();
	}

}
class Drama{
	public void emotions() {
		System.out.println("Emotional scene.... :)");
	}
	public void comedy() {
		System.out.println("Comedy scene.... :)");
	}
}