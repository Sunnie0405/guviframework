import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetExample {
public static void main(String[] args) {
	Set<Integer> s = new HashSet<Integer>();
	s.add(2);
	s.add(2);
	s.add(3);
	s.add(4);
	
	Iterator<Integer>it = s.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
