import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question{
	public static void main(String[] args) {
		String s = "hello world";
char[] ch = s.toCharArray();
Set<Character>set = new HashSet<Character>();
for (int i = 0; i < ch.length; i++) {
//System.out.println(ch[i]);
	set.add(ch[i]);
	
}
Iterator<Character>it = set.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	
}
	}
}


	
	

	
	



