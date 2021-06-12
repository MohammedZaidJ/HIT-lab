package day3;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER TNE VALUE ..");
		int n=sc.nextInt();
		int o=n,f=1;
		while(n!=0) {
			f*=n;
			n--;
		}
		System.out.println("FACTORIAL NO. "+f);

	}

}
