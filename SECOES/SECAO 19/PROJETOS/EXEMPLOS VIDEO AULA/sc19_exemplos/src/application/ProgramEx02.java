package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProductV1;
import services.CalculationService;

public class ProgramEx02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<ProductV1> list = new ArrayList<>();

		String path = "src/input_file/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new ProductV1(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			ProductV1 x = CalculationService.maxSimples(list);
			System.out.println("Most expensive for maxSimples:");
			System.out.println(x);
			
			ProductV1 x_completo = CalculationService.maxCompleto(list);
			System.out.println("Most expensive for maxCompleto:");
			System.out.println(x_completo);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}