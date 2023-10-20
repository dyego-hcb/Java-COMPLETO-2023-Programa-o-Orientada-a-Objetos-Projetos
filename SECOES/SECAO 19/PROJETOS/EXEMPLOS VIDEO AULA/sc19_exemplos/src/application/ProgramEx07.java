package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramEx07 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set.add("TabeletRemove");
		set.add("TabeletRemove2");
		
		System.out.println();
		System.out.println("ADDING AND VERIFT ELEMENT ON SET TEST: ");
		
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("REMOVING TEST: ");
		
		set.remove("TabeletRemove");
		set.removeIf(x -> x.length() >= 10);
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("REMOVING TEST: ");

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("union: " + c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("intersection: " +d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("difference: " + e);
	}
}