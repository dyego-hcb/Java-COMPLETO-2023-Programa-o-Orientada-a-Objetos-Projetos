package application;

public class ProgramEx00 {

	public static void main(String[] args) {
		int p;
		// System.out.println(p); // erro: variável não iniciada
		p = 10;
		System.out.println(p);
		
		int x = 20;
		Object obj = x;
		Integer obj_integer = x;
		int y = (int)obj;
		int z = obj_integer*2;
		
		System.out.println("X: " + x);
		System.out.println("OBJ: " + obj);
		System.out.println("Y: " + y);
		System.out.println("OBJ_INTEGER: " + obj_integer);
		System.out.println("Z: " + z);
	}

}
