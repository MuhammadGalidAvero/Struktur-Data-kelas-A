package Pekan_1;

public class ArrayReview_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deklarasi array dalam bentuk integer
		int [] arr;
		
		//memasukkan ukuran array
		arr = new int[5];
		
		
		//memasukkan isi dari array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//mengeluarkan isi dari array sesuai dengan indek nya
		for (int i = 0; i<arr.length; i++)
			System.out.println("Element at index " + i + " = " + arr[i]);
		
	}

}
