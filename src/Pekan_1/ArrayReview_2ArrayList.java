package Pekan_1;

import java.util.ArrayList;

public class ArrayReview_2ArrayList {
	public static void main (String[]args) {
		//memasukkan panjang arraylist
		int n = 5;
		
		//mendeklarasikan arraylist dengan size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		
		//inisiasi ukuran dari array
		for (int i = 0; i <= n; i++) arrli.add(i);
		 
		//menampilkan array
		System.out.println(arrli);
		
		//menghapus array dengan indeks ke 3
		arrli.remove(3);
		
		//menampilkan array
		System.out.println(arrli);
		
		//menampilkan array yang telah diubah beserta urutan array nya
		for (int i = 0; i< arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
}
