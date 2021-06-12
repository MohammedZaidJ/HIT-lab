package day3;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char op;
		Double n1,n2,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("choose an operator: +,-,*,or /");
		op=sc.next().charAt(0);
		System.out.println("Enter first number");
		n1 = sc.nextDouble();
		System.out.println("Enter second number");
		n2 = sc.nextDouble();
		switch(op) {
		case '+':{
			System.out.println("+"+(n1+n2));
		break;
		}
		case '-':{
			System.out.println("-"+(n1-n2));
			break;
		}
		case '*':{
			System.out.println("*"+(n1*n2));
			break;
	}
	case '/':{
			System.out.println("/"+(n1/n2));
			break;
}	
		}
				
	}

}
