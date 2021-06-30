package day12;

public class OptimisticLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounsellingHall unversity=new CounsellingHall();
		Thread thaqi=new Thread(new CounsellingJob(unversity),"thaqi");
		Thread gayas=new Thread(new CounsellingJob(unversity),"gayas");
		thaqi.start();
		gayas.start();
	}

}
class CounsellingJob implements Runnable{
	public CounsellingJob(CounsellingHall university) {
		this.university=university;
	}
	CounsellingHall university;
	public void run() {
		
		if(Thread.currentThread().getName().equals("thaqi")) {
			university.table1();
			university.table2();
			
		}
		else if(Thread.currentThread().getName().equals("gayas")) {
			university.water();
		}
	}
}
class CounsellingHall{
	synchronized public void table1() {
		System.out.println("entered table1.."+Thread.currentThread().getName());
		try{
			Thread.sleep(2500);
			}
		catch(Exception e) {
		}
	}
	synchronized public void table2() {
		System.out.println("entered table2.."+Thread.currentThread().getName());
		
	}
	public void water() {
		System.out.println("he entered water to drink water..."+Thread.currentThread().getName());
		
	}
	
}