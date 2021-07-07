package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> l=new ArrayList<String>();
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
	}

}
