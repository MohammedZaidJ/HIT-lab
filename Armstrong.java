package day3;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1634 ,o,r,res=0;
		o=n;
		while(o!=0) {
			r=o%10;
			res +=Math.pow(r,n%10);
			o/=10;
		}
		if(n==res) {
			System.out.println("Armstrong NO.. IS "+n);
		}
		else {
			System.out.println("NOT Armstrong NO.."+n);
		}
	}

}
