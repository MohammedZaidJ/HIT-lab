package day19;

public class SlackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(29);
		s.push(13);
		s.push(24);
		System.out.println(s.pop());
	}

}
class Stack{
	int s[]=new int[5];
	int t;
	Stack() {
		t=-1;
	}
	void push(int i) {
		if(t==4)
			System.out.println("slack is full...");
		else
			s[++t]=i;
	}
	int pop() {
		if(t>-1) {
			return s[t--];
		}
		else {
			System.out.println("stack is empty...");
			return -1;
		}
		
	}
	
}

