package day7;

public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		item ic=new vanila(new nuts(new dryfruit(new butterscotch())));
		System.out.println("only one vanila..."+ic.cost());
		
	}

}
abstract class item{
	public abstract int cost();
}
abstract class cream extends item{
	
}
abstract class ingredients extends item{
	
}
class vanila extends cream{
	item it;
	public vanila() {
		
	}
    public vanila(item it) {
		this.it=it;
	}
	public int cost() {
		if(it==null)
		return 15;
		else
			return 10+it.cost();
	}
}
class butterscotch extends cream{
	item it;
	public butterscotch() {
		
	}
    public butterscotch(item it) {
		this.it=it;
	}
	public int cost() {
		if(it==null)
		return 15;
		else
			return 10+it.cost();
	}
}
class nuts extends ingredients{
	item it;
	public nuts() {
		
	}
    public nuts(item it) {
		this.it=it;
	}
	
	public int cost() {
		if(it==null)
		return 5;
		else
			return 5+it.cost();
	}
}
 
class dryfruit extends ingredients{
	item it;
	public dryfruit() {
		
	}
    public dryfruit(item it) {
		this.it=it;
	}
	
	public int cost() {
		if(it==null)
		return 10;
		else
			return 10+it.cost();
	}	
}


