package day13;

public class TwoThreadOneTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canon b=new Canon();
		Shootingtask st=new Shootingtask(b);
		Thread  n=new Thread(st,"nania");
		Thread  m=new Thread(st,"shabeer");
		n.start();
		m.start();
	}

}
class Shootingtask implements Runnable{
	Canon gun;
	public Shootingtask(Canon gun) {
		this.gun=gun;
		
	}
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equals("nania")) {
			for(int i=5;i>0;i--)
				gun.fill();
		}
		else if(t.getName().equals("shabeer")) {
			for(int i=5;i>0;i--)
				gun.shoot();
		
			
		}
	}
}
class Canon{
	boolean flag;
	synchronized public void fill() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(flag) {
			try {
				wait();
			}
			catch(Exception h) {
				
			}
		}
	
		System.out.println(name+"fill the gun");
	    flag=true;
	    notify();
		}
	synchronized public void shoot() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(!flag) {
			try {
				wait();
			}
			catch(Exception h) {
				
			}
		}
			flag=false;
			notify();
		System.out.println(name+"shoot the gun");

	}
}