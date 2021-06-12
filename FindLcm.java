package day3;

public class FindLcm {
	public static void main(String[] args) {
	int lcm,n1=10,n2=19;
	lcm=(n1>n2)?n1:n2;
	while(true) {
		if(lcm % n1==0 && lcm % n2==0) {
			System.out.println("LCM NO.. IS "+lcm);
			break;
		}
	   ++lcm;
	}
	}
	
	

}
