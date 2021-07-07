package day18;

public class Brush {

	public static void main(String[] args) {
		Paint p=new Redpaint();
		Powder pd=new Rosepowder();
//		Goodpaintbrush buh=new Goodpaintbrush();
//		buh.obj=pd;
//        buh.execute();
		GoodPaintBrush<Paint> gpb =new GoodPaintBrush<>();
		gpb.setG(p);
		gpb.getG().color();
		
	}

}
abstract class Paint{
	public abstract void color();
}
class Redpaint extends Paint{
	@Override
	public  void color() {
		System.out.println("red colour...");
	}
}
class Bluepaint extends Paint{
	@Override
	public  void color() {
		System.out.println("blue colour...");
	}
}
abstract class Powder{
	public abstract void domakeup();
}
class Whitepowder extends Powder{
	@Override
	public void domakeup() {
		System.out.println("white powder...");
	}
}
class Rosepowder extends Powder{
	@Override
	public void domakeup() {
		System.out.println("rose powder...");
	}
}
class Goodpaintbrush{
	Object obj;
	public void execute(){
		if(obj instanceof Paint) {
			Paint p=(Paint)obj;
			p.color();
		}
		if(obj instanceof Powder) {
			Powder p1=(Powder)obj;
			p1.domakeup();
		}
		
	}
}
class GoodPaintBrush<G>{
	G obj;
	public G getG() {
		return obj;
	}
	public void setG(G obj) {
		this.obj=obj;
		
	}
	
}