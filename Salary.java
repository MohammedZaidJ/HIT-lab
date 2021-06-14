package day5;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currentsalary;
		double raise=0;
		double newsalary;
		String rating;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the current salary:");
		currentsalary=sc.nextDouble();
		System.out.println("Enter the performance rating(Excellent, Good, or poor):");
		rating=sc.next();
		if(rating.equals("Excellent")) {
			raise=currentsalary*0.06;
		}
		else if(rating.equals("Good")) {
			raise=currentsalary*0.04;
		}
		else if(rating.equals("Poor")) {
			raise=currentsalary*0.0015;
		}
		newsalary=currentsalary+raise;
	//	NumberFormat money =NumberFormat.getCurrencyInstance();
		System.out.println("newsalary is .."+newsalary);
		
		
		
		
	}

}
