package day3;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23,p=1;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				p=0;
			}
		}
		if(p==1)
			System.out.println("PRIME NO. IS "+n);
		else
			System.out.println("NOT A PRIME NO. "+n
					);


		
		
	}

}
