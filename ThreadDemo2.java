package day11;
import java.util.Date;
public class ThreadDemo2 {
	public static void main(String[] args) throws Exception{
		VaccinationCenter vc =new VaccinationCenter();
		Thread t=Thread.currentThread();
		t.setName("zaid");
		System.out.println(new Date());
		System.out.println("before comming to class..");
		Thread kala=new Thread(new jobtokala(vc),"kala");
		kala.start();
		System.out.println("Take class ..for 7-9 golden Batch.."+new Date());
	}
}
class jobtokala implements Runnable{
	VaccinationCenter vc;
	public jobtokala(VaccinationCenter vc) {
		this.vc=vc;
	}
	public void run() {
		System.out.println("job is given to kala.. ");
		try {
			vc.getToken();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
}
class VaccinationCenter{
	public void getToken()throws Exception{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"..standing in queue for token..");
		Thread.sleep(10000);
		System.out.println("token received.."+new Date());
	}
}
