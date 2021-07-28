package Revision5;

public class Lockdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounsellingHall ch=new CounsellingHall();
		new Thread(()->{ch.table1();},"zaara").start();
		new Thread(()->{ch.table2();},"aroo").start();
		new Thread(()->{ch.water();},"abee").start();
		
	}

}
class CounsellingHall{
	synchronized public void table1() {
		System.out.println("in table1..."+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {}
		System.out.println("work finished in table1..."+Thread.currentThread().getName());
		//table2();
	}
	public void table2() {
		System.out.println("in table2..."+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {}
		System.out.println("work finished in table2..."+Thread.currentThread().getName());
	}
	public void water() {
		System.out.println("drinking water..."+Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		}
		catch(Exception e) {}
		System.out.println("finished drinking water..."+Thread.currentThread().getName());
	}
}