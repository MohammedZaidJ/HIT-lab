package day4;

class Cs2 {
	int p,q;
	public Cs2() {
	}
	public Cs2(int x,int y) {
		p=x;
		q=y;
	}
	public int add(int i,int j) {
		return(i+j);
	}
	public int add(int i,int j,int k) {
		return(i+j+k);
	}
	public float add(float f1,float f2) {
		return(f1+f2);
	}
	public void printData() {
		System.out.println("p = "+p);
		System.out.println("q = "+q);
		
	}
}
public class  Cs{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2,y=3,z=4;
		Cs2 c=new Cs2();
		Cs2 cv=new Cs2(x,z);
		cv.printData();
		float m=7.5F,n=7.5F;
		int k=c.add(x, y);
		int t=c.add(x,y,z);
		float ft=c.add(m,n);
		System.out.println("k = "+k);
		System.out.println("t = "+t);

		System.out.println("ft = "+ft);
		
		
	}

}