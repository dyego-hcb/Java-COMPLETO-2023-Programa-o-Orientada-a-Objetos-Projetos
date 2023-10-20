package application;

import entities.Client;

public class ProgramEx06 {

	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		Client c1 = new Client("Maria", "maria@gmail.com.com");
		Client c2 = new Client("Alex", "alex@gmai.com");
		Client c3 = new Client("Maria", "maria@gmail.com.com");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c3);
		
		String s1 = "teste";
		String s2 = "teste";
		
		System.out.println(s1 == s2);
	}

}
