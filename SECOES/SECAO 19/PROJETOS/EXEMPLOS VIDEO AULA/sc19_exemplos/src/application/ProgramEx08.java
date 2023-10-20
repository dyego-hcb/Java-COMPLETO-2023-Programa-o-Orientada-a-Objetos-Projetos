package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.ProductV2;

public class ProgramEx08 {
	public static void main(String[] args) {
		Set<ProductV2> set_hahs = new HashSet<>();
		set_hahs.add(new ProductV2("TV", 900.0));
		set_hahs.add(new ProductV2("Notebook", 1200.0));
		set_hahs.add(new ProductV2("Tablet", 400.0));
		ProductV2 prod = new ProductV2("Notebook", 1200.0);
		System.out.println(set_hahs.contains(prod));

		Set<ProductV2> set_tree = new TreeSet<>();
		set_tree.add(new ProductV2("TV", 900.0));
		set_tree.add(new ProductV2("Notebook", 1200.0));
		set_tree.add(new ProductV2("Tablet", 400.0));
		for (ProductV2 p : set_tree) {
			System.out.println(p);
		}
	}
}