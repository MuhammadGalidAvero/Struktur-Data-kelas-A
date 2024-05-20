package Pekan_4;

public class ListNode {
	public int data;	//data stored in this node
	public ListNode next; //link to the next node in the list
	
	//post : constructs a node with data 0 and null link
	public ListNode() {
		this (0,null);
	}
	
	public ListNode (int data) {
		this.data = data;
		this.next = null;
	}
	
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
}

//bisa digunakan 