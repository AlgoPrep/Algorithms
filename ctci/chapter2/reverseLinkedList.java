// trick to reverse linked list
//essentially set curr point to pre and switch all three pointers by one step
public reverseLinkedList(Node head) {

	Node pre = head;
 	Node curr = head.next;
	while (curr != null) {
		Node dum = curr.next;
		curr.next = pre;
		pre = curr;
		curr = dum;
	}
}
