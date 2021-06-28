package day10;

public class UniversalRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demonstration of Remote is ready to use.. ");
		Tv tv=new Tv();
		SetTopBox stb=new SetTopBox();
		netflix ntf= new netflix();
		soundsystem sdsys=new soundsystem();
		fathernewschannelcom fncc=new fathernewschannelcom(tv,stb,ntf,sdsys);
		motherserialcommand mscc=new motherserialcommand(tv,stb,ntf,sdsys);
		Remote unr=new  Remote();
		unr.executeCommand(1);
		unr.setCommand(fncc, 0);
		unr.setCommand(mscc, 1);
		
		//System.out.println("My father seeing tv now.... :)");
		unr.executeCommand(0);
		unr.executeCommand(1);
		}

}
class Tv{
	public void av1() {
		System.out.println("tv switched to av1 mode..");
	}
	public void switchOn() {
		System.out.println("tv swiched on..");
	}
}
class SetTopBox{
	public void newschannel() {
		System.out.println("news channel played..");
	}
	public void serialchannel() {
		System.out.println("serial channel played..");
	}
}
class netflix{
	public void movieold() {
		System.out.println("old movie is started...");
	}
	
}
class soundsystem{
	public void lowsound() {
		System.out.println(" sound volume decrease..");
	}
	
}
interface Command{
	public void execute();
}
class fathernewschannelcom implements Command{
	Tv tv;SetTopBox stb;netflix ntf;soundsystem sdsys; 
	public fathernewschannelcom(Tv tv,SetTopBox stb,netflix ntf,soundsystem sdsys) {
		this.tv=tv;
		this.stb=stb;
		this.sdsys=sdsys;
		this.ntf=ntf;
		
	}
	public void execute() {
		System.out.println("My Father set up started..");
		tv.switchOn();
		tv.av1();
		stb.newschannel();
		sdsys.lowsound();
		
		System.out.println("he enjoys what he seeing...");
	}
}
class motherserialcommand implements Command{
	Tv tv;SetTopBox stb;netflix ntf;soundsystem sdsys; 
	public motherserialcommand(Tv tv,SetTopBox stb,netflix ntf,soundsystem sdsys) {
	this.tv=tv;
	this.stb=stb;
	this.sdsys=sdsys;
	this.ntf=ntf;
	}
	public void execute() {
		System.out.println("My Mother set up started..");
		tv.switchOn();
		tv.av1();
		stb.newschannel();
		sdsys.lowsound();
		
		System.out.println("She enjoys what he seeing...");
		
	}

	
}
class DummyCommand implements Command{
		public void execute() {
			
			System.out.println("hey i am dummy...");
		}
}

class Remote{
		Command command[]=new Command[2];
		public Remote() {
			for(int i=0;i<command.length;i++) {
				command[i]=new DummyCommand();
			}
		}
		public void setCommand(Command command,int slt) {
			this.command[slt]=command;
			
		}
		public void executeCommand(int slt) {
			command[slt].execute();
		}
	
}
