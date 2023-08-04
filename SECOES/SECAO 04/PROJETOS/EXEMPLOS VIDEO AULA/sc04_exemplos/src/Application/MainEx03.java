package Application;

import java.util.Scanner;

public class MainEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		PARA LER UMA PALAVRA (TEXTO SEM ESPACO)
		String x;
		x = sc.next();
		System.out.println(x);
//		PARA LER UM INTEIRO
		int z;
		z = sc.nextInt();
		System.out.println(z);
//		PARA LER UM FLUTUANTE
		double w;
		w = sc.nextDouble();
		System.out.println(w);
//		PARA LER UM CARACTERE:
		char c;
		c = sc.next().charAt(0);
		System.out.println(c);
//		PARA LER VARIOS DADOS NA MESMA LINHA:
		String a;
		int b;
		double d;
		a = sc.next();
		b = sc.nextInt();
		d = sc.nextDouble();
		System.out.println(a + " " + b + " " + d);
//		PARA LER UM TEXTO ATE QUEBRA DE LINHA:
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
//		CASOS DE QUEBRA DE LINHA PENDENTE
		int g;
		String l1, l2, l3;
		g = sc.nextInt();
		l1 = sc.nextLine();
		l2 = sc.nextLine();
		l3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(g);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
//		CASOS DE QUEBRA DE LINHA PENDENTE CORRIGIDO
		int h;
		String i1, i2, i3;
		h = sc.nextInt();
		sc.nextLine();
		i1 = sc.nextLine();
		i2 = sc.nextLine();
		i3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(h);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		sc.close();
	}

}
