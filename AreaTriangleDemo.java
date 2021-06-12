package day3;
import java.util.Scanner;
class AreaTriangleDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width of the Triangle:");
		double base = sc.nextDouble();
		System.out.println("Enter the height of the Triangle:");
		double height = sc.nextDouble();
		System.out.println("AREA OF TRIANGLE IS : "+(base*height)/2);
	}

}
