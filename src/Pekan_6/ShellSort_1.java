package Pekan_6;

import java.lang.reflect.Array;

public class ShellSort_1 {
	static void printArray (int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println(" ");
	}
	//Function to sort arr using shellSort 
	
	int sort(int arr[]) {
	int n = arr.length;
		//start with a big gap, then reduce the gap
	for (int gap = n / 2; gap >0; gap /= 2) {
		for (int i = gap; i < n; i += 1) {
			int temp = arr[i];
			int j;
			for (j = i; j >= gap && arr[j - gap] > temp; j-= gap)
				arr[j] = arr[j - gap];
			arr [j] = temp;
		}
		}
	return 0;
	}
	
	public static void main (String [] args) {
		int arr[] = {12, 34, 54, 2, 3};
		System.out.print("Data sebelum diurutkan = ");
		printArray(arr);
		ShellSort_1 ob = new ShellSort_1();
		ob.sort(arr);
		System.out.print("Data setelah diurutkan menggunakan ShellSort = ");
		printArray(arr);
	}
}
