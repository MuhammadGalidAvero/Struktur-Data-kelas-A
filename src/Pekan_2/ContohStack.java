package Pekan_2;

import java.util.Stack;
public class ContohStack {

	public static void main(String[] args) {
		ArrayStack test = new ArrayStack();
		Integer [] a = {4, 8, 15, 16, 23, 42,};
		for (int i = 0; i < a.length; i++) {
			System.out.println("Nilai A " + i + "=" + a[i]);
			test.push(a[i]);
		}
		System.out.println("Size stacknya = " + test.size() );
		System.out.println("paling atas = " + test.pop());
		System.out.println("Nilainya = " + test.pop());
	}

}
