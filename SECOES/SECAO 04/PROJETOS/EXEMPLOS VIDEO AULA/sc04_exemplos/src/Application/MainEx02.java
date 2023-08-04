package Application;

public class MainEx02 {

	public static void main(String[] args) {
//		ATRIBUICAO EXEMPLO01
		int x, y;
		x = 5;
		y = 2*x;
		System.out.println(x);
		System.out.println(y);
//		ATRIBUICAO EXEMPLO02
		int z;
		double w;
		z = 5;
		w = 2*z;
		System.out.println(z);
		System.out.println(w);
//		ATRIBUICAO EXEMPLO03
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
//		ATRIBUICAO EXEMPLO04
		int a, c;
		double resultado;
		a = 5;
		c = 2;
		resultado = a / c;
		System.out.println(resultado);
//		ATRIBUICAO EXEMPLO04 COM CASTING
		int d, e;
		double resultadoCasting;
		d = 5;
		e = 2;
		resultadoCasting = (double) d / e;
		System.out.println(resultadoCasting);
//		ATRIBUICAO EXEMPLO05
		double f;
		int g;
		f = 5.0;
		g = (int) f;
		System.out.println(g);
	}

}
