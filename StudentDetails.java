package day4;

public class StudentDetails {
	String name,city;
	int age;
	static int m;
	void printData() {
		System.out.println("Student Name : "+name);
		System.out.println("Student city : "+city);
		System.out.println("Student age  : "+age);
		System.out.println("Student m    : "+m);
		System.out.println("Nothing");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails s1=new StudentDetails();
		StudentDetails s2=new StudentDetails();
		s1.name="zailo";
		s1.city="zotopai";
		s1.age=56;
		s1.m=1997;
		s1.printData();
		s2.name="saba";
		s2.city="zootopai";
		s2.age=46;
		s2.printData();
		StudentDetails.m =90; 
	//	System.out.println("Student m"+m);
		
	}

}
