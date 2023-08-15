

public class MainExemplo03 {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG";
		String minuscula = original.toLowerCase();
		String maiuscula = original.toUpperCase();
		String original_sem_espaco = original.trim();
		String recortar_inicio = original.substring(2);
		String recortar_inicio_fim = original.substring(2, 9);
		String alterar_a_por_x = original.replace('a', 'x');
		String alterar_string = original.replaceAll("abc", "xyzz");
		String split_string = "pottato apple lemon onrange";
		int index_bc_primeiro = original.indexOf("bc");
		int index_bc_ultimo = original.lastIndexOf("bc");
		String[] splitVet = split_string.split(" ");
		
		System.out.println("ORIGINAL: - " + original + " -");
		System.out.println("toLowerCase: - " + minuscula + " -");
		System.out.println("toUpperCase: - " + maiuscula + " -");
		System.out.println("trim: - " + original_sem_espaco + " -");
		System.out.println("original.substring(2): - " + recortar_inicio + " -");
		System.out.println("original.substring(2, 9): - " + recortar_inicio_fim + " -");
		System.out.println("original.replace('a', 'x');: - " + alterar_a_por_x + " -");
		System.out.println("original.replaceAll('abc', 'xyzz'): - " + alterar_string + " -");
		System.out.println("indexOf('bc'): - " + index_bc_primeiro + " -");
		System.out.println("lastIndexOf('bc'): - " + index_bc_ultimo + " -");
		for(int i=0; i< splitVet.length; i++)
		{
			System.out.println("[" + i + "] " + splitVet[i]);
		}
	}

}
