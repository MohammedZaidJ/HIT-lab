package Revision5;

public class InterviewHall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interview i=new Interview();
		new Thread(()->{
			synchronized(i) {
			Interview.Interview1();
			Interview.Interview2();
			Interview.Interview3();
			Interview.Interview1();
			Interview.Interview2();}
			
		},"abee").start();
		new Thread(()->{
			synchronized(i) {
			i.Interview1();
			i.Interview2();
			i.Interview3();
			i.Interview3();
			i.Interview2();}
		},"zabee").start();
		
	}

}
class Interview{
	public static void Interview1() {
		System.out.println("first question asked by the interviewer to...."+Thread.currentThread().getName());
	}
	public static void Interview2() {
		System.out.println("second question asked by the interviewer to...."+Thread.currentThread().getName());
	}
	public static void Interview3() {
		System.out.println("third question asked by the interviewer to...."+Thread.currentThread().getName());
	}
	
}
