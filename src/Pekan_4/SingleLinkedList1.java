package Pekan_4;

public class SingleLinkedList1 {
	public static void main (String [] args) {
		ListNode list = new ListNode();  //ListNode adalah fungsi yang dibuat sebelumnya
		list.data = 43;
		list.next = new ListNode();
		list.next.data = -3;
		list.next.next = new ListNode();
		list.next.next.data = 17;
		list.next.next.next = null;
		System.out.println (list.data + " " + list.next.data + " " + list.next.next.data);
	}
}
