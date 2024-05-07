package Pekan_1;

import java.util.ArrayList;

public class ArrayReview_3GetElement {

	public static void main(String[] args) {
		//menginisiasi arraylist
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//add number
		list.add(9);
		list.add(5);
		list.add(3);
		
		System.out.println(list);
		
		//get method
		Integer n = list.get(1);
		
		System.out.println("Pada Indeks ke 1 Angkanya adalah = " + n);
	}

}
