package day18;

public class BasicGenerics {

	public static void main(String[] args) {
		Ball b=new Ball();
		Sky s=new Sky();
		Rightaccept<Sky> bs=new Rightaccept<>();
		bs.getT();
		bs.setT(s);
		
	}

}
class Sky{
	
	
}
class Ball{
	
}
class Rightaccept<T>{
	T obj;
	public T getT() {
		return obj;
	}
	public void  setT(T obj) {
		this.obj=obj;
		System.out.println("Basic generics.....");
	}
}
class Accept{
	Object obj;
	
}