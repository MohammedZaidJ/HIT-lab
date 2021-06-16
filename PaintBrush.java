package day6;

import java.util.Scanner;

public class PaintBrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		PaintBrush brush=new PaintBrush();
		System.out.println("Please 1 for red , 2 for blue ,3 for yellow");
		int c=sc.nextInt();
		brush.doPaint(c);
	}
	public void doPaint(int c) {
		if(c==1)
			System.out.println("red colour");
		else if(c==2)
			System.out.println("blue colour");
		else if(c==3)
			System.out.println("yellow colour");
		else if(c==3)
			System.out.println("pink colur");
		
	}

}
