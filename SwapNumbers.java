package day2;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10,n2=20;
		System.out.println("before swap");
		System.out.println("first no.."+n1);
		System.out.println("second no.."+n2);
		n1=n1-n2;
		n2=n1+n2;
		n1=n2-n1;
		System.out.println("after swap");
		System.out.println("first no.."+n1);
		System.out.println("second no.."+n2);
		
	}

}
