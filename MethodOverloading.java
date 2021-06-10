package day9;

public class MethodOverloading {
	public MethodOverloading() {
		System.out.println("0 args constructor...");
	}
	public MethodOverloading(int a) {
		System.out.println("1 args constructor..."+a);
	}
	public MethodOverloading(int a,int b) {
		System.out.println("2 arg constructor..."+a+" value "+b);
	}
	public static void  main(String[] args){
	MethodOverloading mol=new MethodOverloading();
	new MethodOverloading(10,20);
	new MethodOverloading();
	new MethodOverloading(10);
	mol.add();
	mol.add(2,3);
	}
	void add(){ //function <or> method
		System.out.println("MethodOverloading with out parameter");
		
	}//add method name
	void add(int a,int b) {
		System.out.println("MethodOverloading with 2 parameters"+(a+b));
	}
	
}

