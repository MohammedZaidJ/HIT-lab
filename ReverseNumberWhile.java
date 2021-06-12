package day3;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0,n=2345,rs=0,o=n;
		while(n!=0) {
			rs=(rs*10) +(n%10);
			n/=10;
		}
		System.out.println("Reverse No.. of "+o+" is "+rs);	
		
		

	}

}
