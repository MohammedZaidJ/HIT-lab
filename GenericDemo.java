package day18;

public class GenericDemo {
	public static void main(String[] args) {
		Phone phn = new Games();
		BasicPhone bphn = new Calling();

		OS<BasicPhone> os = new OS<>();
		os.set(bphn);
		os.get().general();
	}

}
abstract class Phone{
	abstract void apps();
}
class Games extends Phone{
	@Override
	void apps() {
		System.out.println("Playing games......");
	}
	
}
class SocialMedia extends Phone{
	@Override
	void apps() {
		System.out.println("Whatsapp is used connect with people......");
	}
	
}
abstract class BasicPhone{
	abstract void general();
}
class Calling extends BasicPhone{
	@Override
	void general() {
		System.out.println("Calling.....");
	}
	
}
class Message extends BasicPhone{
	@Override
	void general() {
		System.out.println("Messaging......");
	}
	
}
class OS<o>{
	o os;
	public o get() {
		return os;	
	}
	void set(o obj) {
		this.os=obj;
	}
}
