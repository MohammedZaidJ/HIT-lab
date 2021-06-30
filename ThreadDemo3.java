package day11;

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t=Thread.currentThread();
        t.setName("thaqi");
        System.out.println("Reservation counter staring working ..."+t.getName());
        ReservationCounter central=new ReservationCounter();
        Thread thaqi=new Thread(new Bookingjob(central,200),"thaqi");
        Thread zaid=new Thread(new Bookingjob(central,300),"zaid");
        thaqi.start();
        zaid.start();
        
	}

}
class Bookingjob implements Runnable{
	ReservationCounter Central;
	int amt;
	public Bookingjob(ReservationCounter Central,int amt) {
		this.Central=Central;
		this.amt=amt;
	}
	public void run() {
		Central.bookTicket(amt);
		Central.giveChange();
	}
}
class  ReservationCounter{
	int amt;
	public void bookTicket(int amt) {
		this.amt=amt;
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"has come to book the ticket..");
		System.out.println(name+"brought..."+amt);
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("change given to .."+name);
		System.out.println(name+"takes.."+(amt-100));
	}
	
}
