package Pekan_1;

import java.util.ArrayList;

public class ArrayReview_4ListSisip {

	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<Integer>();
		List.add(1);
		List.add(2);
		List.add(4);
		System.out.println(List);
		
		//insert missing element 3
		
		List.add(2, 3);
		System.out.println(List);
	}

}
