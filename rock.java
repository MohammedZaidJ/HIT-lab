package day5;

import java.util.Random;
import java.util.Scanner;

public class rock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter any of this 1 to 10");
		int personplay=sc.nextInt();
		int mx=10,mn=1;
		Random gen =new Random();
		int computerint=(int)(Math.random()*(mx-mn+1)+mn);
		System.out.println("random no "+computerint);
		int x=personplay + computerint;
		if(personplay==computerint)
			System.out.println("you won first price");
		else if(x==personplay + 1) {
			System.out.println("you won second price");
		}
		else
			System.out.println(":)sorry try again!!! :)");
	}

}
