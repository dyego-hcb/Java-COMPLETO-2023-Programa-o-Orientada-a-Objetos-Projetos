package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramEx01 {
	public static void main(String[] args) {
		String path = "src/arquivo_entrada/in.txt";
		Scanner sc = null;
		try {
			File file = new File(path);
			sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(sc != null)
			{
				sc.close();
			}
		}
	}
}