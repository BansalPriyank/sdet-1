package JavaSession3;
import java.util.HashSet;
public class Activity3_2 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("M");
		hs.add("N");
		hs.add("O");
		hs.add("P");
		hs.add("Q");
		hs.add("R");
		System.out.println("Size of the original hash set is "+hs);
		System.out.println("Size of the hash set is "+hs.size());
		System.out.println("Remove an element from set "+ hs.remove("M"));
		System.out.println("Remove an element not present in set "+ hs.remove("AB"));
		System.out.println("Check if P present in the set " + hs.contains("P"));
		System.out.println("Updated set is "+ hs);
	}
}
