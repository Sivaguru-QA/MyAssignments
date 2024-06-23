package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class learnRemoveDuplicates {

	public static void main(String[] args) {
		
		String name="sivagurunathan";
		char[] charArray = name.toCharArray();
		String output="";
		
		Set<Character> removechar = new LinkedHashSet<Character>();
		
		for (Character duplicate : charArray) {
			removechar.add(duplicate);
			
		}
		System.out.println(removechar);
		for (Character character : removechar) {
			output+=character;
			
		}
		System.out.println(output);
		
	}

}
