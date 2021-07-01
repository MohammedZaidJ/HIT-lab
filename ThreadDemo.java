package day13;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t = new Thread();
        dryfruit df=new dryfruit();
        veg vg=new veg();
        bike bk=new bike();
        Thread zaid=new Thread(df,"gayas");
        Thread taqi=new Thread(bk,"bireadd taqi");
        Thread vip=new Thread(vg,"buy vip");
        zaid.start();
        taqi.start();
        vip.start();
        System.out.println("game over...:>");
        
	}

}
class dryfruit implements Runnable{
	@Override
	public void run(){
		System.out.println("dryfruit are brought  by him..."+Thread.currentThread().getName());
	}
}
class veg implements Runnable{
	@Override
	public void run(){
		System.out.println("vegetable brought  by him..."+Thread.currentThread().getName());
	}
}
class  bike implements Runnable{
	@Override
	public void run() {
		System.out.println("bike is brought by him...."+Thread.currentThread().getName());
	}
}