package day9;

public class tackmol {
	void add(int a,int b){
		System.out.println("result of two no.. is :"+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("result of three no.. is :"+(a+b+c));
	}
	void add(String a,int b) {
		System.out.println("NAME :"+a+" \nreg  :"+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tackmol k=new tackmol();
		k.add("zaid" ,21255);
		k.add(2,4);
		k.add(2,3,4);
		
	}

}
