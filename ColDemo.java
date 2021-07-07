package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ColDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> l=new ArrayList<>();
        l.add("Hello");
        l.add("Dude");
        l.add("haii");
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.contains("Dude"));
        l.add("A");
        l.add("B");
        l.add("C");
        System.out.println(l);
        Collections.sort(l);
        System.out.println("After sorting list....");
        System.out.println(l);
        Iterator<String> it=l.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        System.out.println("reverse the list in essy method by using listiteratro /n");
        ListIterator<String> lit=l.listIterator();
        while(lit.hasNext()) {//doubte !!!          ^_^
        	System.out.println(lit.next());
        }
        while(lit.hasPrevious()) {
        	System.out.println(lit.previous());
        }
        
        
        
	}

}
