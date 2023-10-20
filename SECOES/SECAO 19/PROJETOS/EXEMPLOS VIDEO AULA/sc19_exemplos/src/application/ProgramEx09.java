package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.ProductV2;

public class ProgramEx09 {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		cookies.remove("email");
		cookies.put("phone", "99771133");
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Contains 'email' key: " + cookies.containsKey("email"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		Map<ProductV2, Double> stock = new HashMap<>();
		ProductV2 p1 = new ProductV2("Tv", 900.0);
		ProductV2 p2 = new ProductV2("Notebook", 1200.0);
		ProductV2 p3 = new ProductV2("Tablet", 400.0);
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		ProductV2 ps = new ProductV2("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}
}