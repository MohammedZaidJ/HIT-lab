package day4;

public class Employee {
	int empid;
	String empname;
	//CREAT A CONSTRUCTOR WITH TWO PARA{}//
	Employee(int i,String n){
		this.empid=i;
		this.empname=n;
	}
	void info() {
		System.out.println("id  : "+empid+"\nname  : "+empname);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee oj=new Employee(21255,"zialo");
		Employee op=new Employee(21176,"sabuu");
		oj.info();
		op.info();
	}

}
