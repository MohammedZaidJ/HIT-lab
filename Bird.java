package day4;

public class Bird {
	String name;
	int  age;
	Bird(){
		System.out.println("this is a sparow");
	}
	Bird(String x){
		name=x;
		System.out.println("this is a "+name);
			
	}
	Bird(int x,String c){
		age=x;
		name=c;
		System.out.println("this age  is "+age+" name of the bird is "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird a=new Bird();
		Bird b=new Bird("maina");
		Bird c=new Bird(23,"queenbee");
		
	}

}
