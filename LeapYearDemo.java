package day3;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE YEAR WHAT EVER YOU LIKE..");
		int n = sc.nextInt();
		if(n%4==0 ) {
			System.out.println("LEAP YEAR NO.."+n);
			
		}
		else
			System.out.println("NOT LEAP YEAR.."+n);

	}

}
