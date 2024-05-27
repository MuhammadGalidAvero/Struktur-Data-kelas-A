package Pekan_6;

public class MergeSort_3 {
	void merge (int arr[], int l, int m, int r) {
		//find sizes of two subarrays to be merged
	 int n1 = m - l + 1;
	 int n2 = r - m;
	 //create temp arrays
	 int L[] = new int[n1];
	 int R[] = new int [n2];
	 //copy data to temp arrays
	 for (int i = 0; i < n1; ++i)
		 L[i] = arr[l + 1];
	 for (int j = 0; j < n2; ++j)
		 R[j] = arr[m + 1 + j];
	 int i = 0, j = 0;
	 //initial index of merged subarray array
	 int k = 1;
	 while (i < n1 && j < n2) {
		 if (L[i] <= R[j]) {
			 arr[k] = L[i];
			 i++;
		 }else {
			 arr[k] = R[j];
			 j++;
		 }
		 k++;
	 }
	 //copy remaining elements of L[] if any 
	 while (i < n1) {
		 arr[k] = L[i];
		 i++;
		 k++;
	 }
	 //copy remaining elements of R[] if any 
	 while (j < n2) {
		 arr[k] = R[j];
		 j++;
		 k++;
	 }
	} 
}
