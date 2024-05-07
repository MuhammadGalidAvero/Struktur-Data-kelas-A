package Pekan_1;

import java.util.ArrayList;

public class ArrayReview_5ListIterasi {

	public static void main(String[] args) {
		//Creating an arraylist of string type
		ArrayList<String> al = new ArrayList<>();
		
		//adding element to arraylist
		//using standard add() method
		
		al.add("Saya");
		al.add("Informatika");
		al.add(1, "mahasiswa");
		
		//using the Get Method and the for loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i) + " ");
		}
		System.out.println();
		
		//using the  for each loop
		for (String str : al)
		System.out.print( str + " ");
		System.out.println();
		
		//Printing all elements of ArrayList
		System.out.println("Initial ArrayList " + al);
		
		//Removing element from above arraylist
		al.remove(1);
		
		//Printing the updated ArrayList elements
		System.out.println("After the Index Removal " + al);
		
		//removing this word element in ArrayList
		al.remove("Saya");
		
		//Printing the final updated ArrayList
		System.out.println("After the object Removal " + al);
	}
}
