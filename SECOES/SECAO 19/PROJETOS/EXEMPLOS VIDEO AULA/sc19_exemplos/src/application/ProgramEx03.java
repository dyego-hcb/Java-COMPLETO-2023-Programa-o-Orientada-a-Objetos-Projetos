package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramEx03 {

	public static void main(String[] args) {

//		ERRO PQ LISTA DE INTERGER NAO E SUPER DE LIST DE OBJECT
//		List<Object> myObjs = new ArrayList<Object>();
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers; // erro de compilação

//		OBJ E SUPER DE INTEGER POR ISSO OK
		Object obj;
		Integer x = 10;
		obj = x;

		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<?> list = new ArrayList<Integer>();
//		list.add(3); // erro de compilação pois o compilador nao sabe o tipo especifico da lista que foi instanciada
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
