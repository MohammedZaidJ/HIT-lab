package day2;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10,n2=2;
		System.out.println("before swap");
		System.out.println("first no.."+n1);
		System.out.println("second no.."+n2);
		int t = n1;
		n1=n2;
		n2=t;
		System.out.println("after swap");
		System.out.println("first no.."+n1);
		System.out.println("second no.."+n2);
	}

}
