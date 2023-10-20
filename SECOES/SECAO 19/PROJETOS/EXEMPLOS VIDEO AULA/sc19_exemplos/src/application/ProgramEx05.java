package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramEx05 {

	public static void main(String[] args) {
		
//		COVARIANCIA
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
//		list.add(20); // erro de compilacao pq n sabe se e o tipo compativel
		
//		CONTRAVARIANCIA
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
//		Number x = myNums.get(0); // erro de compilacao pq pode ser do super tipo de Number
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjsProblem = new ArrayList<Object>();
		copy(myInts, myObjsProblem);
		copy(myDoubles, myObjsProblem);
		printList(myObjsProblem);
	}
	
	public static void copy(List <? extends Number> source, List<? super Number> destiny)
	{
		for(Number number : source)
		{
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list)
	{
		for(Object obj : list)
		{
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
